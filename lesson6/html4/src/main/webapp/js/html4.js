window.onload=relocateMainContent;

function relocateMainContent() {
    var topHeight = document.getElementById("top-wrapper").clientHeight;
    var footerHeight = document.getElementById("footer").clientHeight;
    var windowHeight = window.innerHeight

//    var windowWidth = window.innerWidth
//    document.getElementById("main-content").innerHTML = windowHeight +"+"+windowWidth+"+"+topHeight +"+"+footerHeight +"px";

    document.getElementById("main-content-wrapper").style.paddingTop=topHeight+"px";
    document.getElementById("main-content").style.height=(windowHeight-topHeight)+"px";
}

