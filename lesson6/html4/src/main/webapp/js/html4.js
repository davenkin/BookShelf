window.onload=relocateMainContent;

function relocateMainContent() {
    var topHeight = document.getElementById("top-wrapper").clientHeight;
    document.getElementById("main-content").style.marginTop=topHeight+"px";
}
