

/* 	Sticky Menu - Makes the menu stick to the top of a page 
	Animates the up and down movement when the menu buttons are clicked
*/
$(".pin").each(function() {
    var b = $(this);
    var a = $("#" + $(this).attr("data-target"));
    b.pushpin({
        top: a.offset().top,
        bottom: a.offset().top + a.outerHeight() - b.height()
    })
});


/* Menu Buttons */
$(function pageLoad() {
    var a = window.innerWidth;
    var d = window.innerHeight;

    $(".m_home").click(function() {
        $("html, body").animate({
            scrollTop: $("#landing").offset().top
        }, 1000)
    });

    $(".m_serv").click(function() {
        $("html, body").animate({
            scrollTop: $("#serv_w").offset().top
        }, 1000)
    });
    if (d > a && d < 600) {
        var c = "#about_w"
    } else {
        if (d < a && a < 900) {
            var c = "#about_w"
        } else {
            var c = "#banner1"
        }
    }

    $(".m_team").click(function() {
        $("html, body").animate({
            scrollTop: $(c).offset().top
        }, 1000)
    });

    $(".m_contact").click(function() {
        $("html, body").animate({
            scrollTop: $("#contact_w").offset().top
        }, 1000)
    });



/* Mobile Menu Controls */
    $("#mobile_menu_init_btn").click(function() {
        $("#mobile_menu_block").animate({
            left: "+=100vw"
        }, "slow");
        $("#mobile_menu_wrapper").animate({
            left: "+=100vw"
        }, "400")
    });
    
    $(".back").click(function() {
        $("#mobile_menu_block").animate({
            left: "-=100vw"
        }, "slow");
        $("#mobile_menu_wrapper").animate({
            left: "-=100vw"
        }, "fast")
    });

/* Menu Controls */
    var b = window.innerHeight;
    $(".pin").pushpin({
        top: b,
        bottom: 90000,
        offset: 0
    })
});