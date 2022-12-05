const express = require('express')
const app = express()
const port = 3001
const path=require('path');
const cors = require('cors');
app.use(cors({
    origin: '*'
}));
app.use(express.json());
app.use(express.urlencoded({ extended: true }));

app.use('/home', function(req,res){
res.sendFile(path.join(__dirname+'/express/home.html'))
});
app.use('/comments', function(req,res){
    res.sendFile(path.join(__dirname+'/express/comments.html'))
    });
app.listen(port, () => {
    console.log(`Example app listening on port ${port}`)
})