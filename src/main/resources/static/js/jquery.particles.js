
if (typeof jQuery === "undefined") {
    console.log("Make sure jQuery is included before jquery.particles.js")
}(function(g, f) {
	
    var e, a, d, b, c;
    var e = function(h, i) {
        this.options = h;
        d = i[0];
        b = d.getContext("2d");
        this.particles = [];
        this.defaults = {
            maxParticles: 100,
            size: 3,
            speed: 0.5,
            color: "#000000",
            minDist: 140,
            connectParticles: false
        };
        this._init()
    };
    e.prototype = {
        _init: function() {
            c = g.extend({}, this.defaults, this.options);
            if (this._isHex(c.color)) {
                c.color = this._hex2rgb(c.color)
            }
            f.addEventListener("resize", this._resize.bind(this), false);
            d.width = f.innerWidth;
            d.height = f.innerHeight;
            for (var h = 0; h < c.maxParticles; h++) {
                this.particles.push(new a())
            }
            this._animate()
        },
        _draw: function() {
            b.clearRect(0, 0, d.width, d.height);
            for (var h = 0; h < this.particles.length; h++) {
                var j = this.particles[h];
                j._draw()
            }
            this._update()
        },
        _distance: function(k, j) {
            var l, i = k.x - j.x,
                h = k.y - j.y;
            l = Math.sqrt(i * i + h * h);
            if (l <= c.minDist) {
                b.beginPath();
                b.strokeStyle = "rgba(" + c.color.r + ", " + c.color.g + ", " + c.color.b + ", " + (1.2 - l / c.minDist) + ")";
                b.moveTo(k.x, k.y);
                b.lineTo(j.x, j.y);
                b.stroke();
                b.closePath()
            }
        },
        _update: function() {
            for (var k = 0; k < this.particles.length; k++) {
                var m = this.particles[k];
                m.x += m.vx;
                m.y += m.vy;
                if (m.x + m.radius > d.width) {
                    m.x = m.radius
                } else {
                    if (m.x - m.radius < 0) {
                        m.x = d.width - m.radius
                    }
                }
                if (m.y + m.radius > d.height) {
                    m.y = m.radius
                } else {
                    if (m.y - m.radius < 0) {
                        m.y = d.height - m.radius
                    }
                }
                if (c.connectParticles) {
                    for (var h = k + 1; h < this.particles.length; h++) {
                        var l = this.particles[h];
                        this._distance(m, l)
                    }
                }
            }
        },
        _animate: function() {
            this._draw();
            f.requestAnimationFrame(this._animate.bind(this))
        },
        _resize: function() {
            d.width = f.innerWidth;
            d.height = f.innerHeight;
            this._draw()
        },
        _isHex: function(h) {
            return /(^#[0-9A-F]{6}$)|(^#[0-9A-F]{3}$)/i.test(h)
        },
        _hex2rgb: function(i) {
            var h = /^#?([a-f\d]{2})([a-f\d]{2})([a-f\d]{2})$/i.exec(i);
            return h ? {
                r: parseInt(h[1], 16),
                g: parseInt(h[2], 16),
                b: parseInt(h[3], 16)
            } : null
        }
    };
    var a = function() {
        this.x = Math.random() * d.width;
        this.y = Math.random() * d.height;
        this.vx = Math.random() * c.speed * 2 - c.speed;
        this.vy = Math.random() * c.speed * 2 - c.speed;
        this.radius = Math.random() * Math.random() * c.size;
        this._draw(b, c)
    };
    a.prototype = {
        _draw: function() {
            b.fillStyle = "rgb(" + c.color.r + ", " + c.color.g + ", " + c.color.b + ")";
            b.beginPath();
            b.arc(this.x, this.y, this.radius, 0, Math.PI * 2, false);
            b.fill()
        }
    };
    g.fn.particles = function(h) {
        return new e(h, this)
    }
})(jQuery, window);


/* Particles controls */
$(document).ready(function() {
    var a = window.innerWidth / 18.82;
    $(".canvas").particles({
        connectParticles: true,
        color: "#71fcfc",
        size: 3,
        maxParticles: a,
        speed: 1.3
    })
});