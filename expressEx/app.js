const express = require('express')
const app = express()
const port = 3000
const path=require('path');
const cors = require('cors');
app.use(cors({
    origin: '*'
}));
app.use(express.json());
app.use(express.urlencoded({ extended: true }));

let listOfMovies= ["Nightcrawler", "Barbarian", "Inception", "It Follows"]
let comments= ["I love all these movies!", "I could watch It Follows everyday", "Not a fan of Nightcrawler"]
app.get('/', (req, res) => {
  res.send(listOfMovies)
})
app.post('/', (req, res) => {
    listOfMovies.push(unCamelCase(req.body.movie));
    res.send(listOfMovies);
  })

app.delete('/:movieName', (req,res)=>{
    for(let i =0; i<listOfMovies.length;i++){
        if(unCamelCase(req.params.movieName)==listOfMovies.at(i)){
            listOfMovies.splice(i,1)
        }
    }
    res.send(listOfMovies)
})
app.get('/comments', (req, res) => {
    res.send(comments);
  })
app.post('/comments', (req, res) => {
    comments.push(req.body.comments);
    res.send(comments);
})
app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})



//------------------------------------------------------------------------------------















function camelCase(s) {
    let ar=s.toLowerCase().split(" ");
    let ans="";
    for(let i=0; i< ar.length; i++){
        if(i!=0){
           ans+= (ar[i].charAt(0)).toUpperCase()+ar[i].substr(1)
        }else{
            ans+=ar[i];
        }
    }
    return ans;
}
function unCamelCase(ans){
    let camelcasedString =camelCase(ans);
    let reverse= "";
    for(let j=0; j<camelcasedString.length; j++){
        if(j==0){
            reverse+=camelcasedString.charAt(j).toUpperCase();
        }else if(camelcasedString.charAt(j)==camelcasedString.charAt(j).toUpperCase()){
            reverse+=" "+camelcasedString.charAt(j);
        }else{
            reverse+=camelcasedString.charAt(j);
        }
    }
    return reverse;
}