let trad = document.querySelector(".traduction");
trad.addEventListener("click", changeLanguage);


function changeLanguage(){
    googleTranslateElementInit();
    document.getElementById("menu_traduction").style.overflow = "visible";
    document.querySelector(".logo").style.marginTop = "60px";
    
}
function googleTranslateElementInit(){ 
    new google.translate.TranslateElement({pageLanguage: 'fr'}, 'menu_traduction'); 
  } 
