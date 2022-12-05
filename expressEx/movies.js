
let movieListDocument= document.getElementById("movieList");
let commentListDocument= document.getElementById("commentList");

let movieInput= document.getElementById("movieInput");
let commentInput= document.getElementById("commentInput");

let movieButton=document.getElementById("movieButton");
movieButton.onclick=addMovie;
let commentButton=document.getElementById("commentButton");
commentButton.onclick=addComment;

let movieMessage= document.getElementById("movieMessage");
let commentMessage= document.getElementById("commentMessage");


window.onload = async function() {
   await loadMovies();
    await loadComments();
  };

async function loadMovies(){
    let response = await fetch("http://localhost:3000/movie");
    response = await response.json();
    fillInMovies(response);
}
async function loadComments(){
    let response2 = await fetch("http://localhost:3000/comments");
    response2 = await response2.json();
    fillInComments(response2);
}
function fillInMovies(response){
    movieListDocument.innerHTML="";
    let newList= document.createElement("ul");
    for(let i=0; i< response.length; i++){
        let newItem=document.createElement("li");
        newItem.innerHTML=response[i];
        newList.appendChild(newItem);
    }
    movieListDocument.appendChild(newList);
}
function fillInComments(response2){
    commentListDocument.innerHTML="";
    let newList= document.createElement("ul");
    for(let i=0; i< response2.length; i++){
        let newItem=document.createElement("li");
        newItem.innerHTML=response2[i];
        newList.appendChild(newItem);
    }
    commentListDocument.appendChild(newList);
}
async function addMovie(){
    if(movieInput.value!=""){
        movieMessage.innerHTML="";
        let inputItem = {
           movie: movieInput.value
        }
        let response = await fetch("http://localhost:3000/movie", {
            method:'POST',
            mode:'cors',
            headers: {
                'Content-Type': 'application/json'
              },
            body:JSON.stringify(inputItem)
        });
    }else{
        movieMessage.innerHTML="Must input a movie name";
    }
    loadMovies();
}
async function addComment(){
    if(commentInput.value!=""){
        commentMessage.innerHTML="";
        let inputItem = {
           comments: commentInput.value
        }
        let response = await fetch("http://localhost:3000/comments", {
            method:'POST',
            mode:'cors',
            headers: {
                'Content-Type': 'application/json'
              },
            body:JSON.stringify(inputItem)
        });
    }else{
         commentMessage.innerHTML="Must input a comment";
    }
    loadComments();

}