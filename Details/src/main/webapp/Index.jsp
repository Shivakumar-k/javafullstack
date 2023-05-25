<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<meta charset="ISO-8859-1">
<title>Details page</title>

</head>
<body>
	<h1>Enter here.........</h1>
	<div class="form">

<form method="post" action="Display.jsp" >

<pre>
 <h2>Personal details</h2>
	<div class="in">Name<input type="text" name="Name"></div>
 
 
 Email<input type="email" name="email">
 
 Native Place<input type="text" name="place">
 
 State <input type="text" name="state" >
 
 Country <input type="text" name="country" >
 
 Mobile No.<input type="text" name="MobileNo">
 
 Date of birth <input type="date" name="birth">
 
 Age<input type="number" name="age" min="18" max="60">
 
 School<input type="text" name = "school">
 
 School Board:
<label><input type="radio" name="sboard" value="state"> State</label>
<label><input type="radio" name="sboard" value="cbse"> CBSE</label>
 
 
 PU College<input type="text" name="pucollege">
 
 Pu Board<label><input type="radio" name="puboard" value="state"> State</label>
<label><input type="radio" name="puboard" value="cbse"> CBSE</label>
 
 Degree:
<select name="degree">
  <option value="">Select an option</option>
  <option value="bachelor">B.E</option>
  <option value="bca">BCA</option>
  <option value="bsc">BSC</option>
</select>
 
 Degree Collage <input type="text" name="dcollage">
 
 University <label><input type="radio" name="uni" value="VTU"> vtu</label>
<label><input type="radio" name="uni" value="auto"> Autonomous</label>
 
 Branch <select name="branch">
  <option value="">Select an option</option>
  <option value="Mech">Mech</option>
  <option value="cs">CS</option>
  <option value="ec">Ec</option>
  <option value= "Civil">Civil</option>
</select>
 
 CGPA <input type="number" name="cgpa" min="3" max="10">
  
 Project Name: <input type="text" name="prjt">
 
 Recognitions <input type="text" name="recg">
 
 No of members in a project<input type="text" name="nome" min="2" max="5">
 
 Role <input type="text" name="role">
 
 Hobbies<input type="text" name="hobbies">
 
 Skills<input type="text" name="skills">
 
 Stay <input type="text" name="stay">
 
 USN<input type="text" name="usn">
 
 Topics of intrests<input type="text" name="intrests">
 
 Fav sport<select name="sport">
  <option value="">Select an option</option>
  <option value="cricket">Cricket</option>
  <option value="Football">Football</option>
  <option value="basket">Baskekball</option>
  <option value= "other">others</option>
</select>
 
 Fav Sport League <select name="league">
  <option value="">Select an option</option>
  <option value="IPL">IPL</option>
  <option value="BBL">BigBash</option>
  <option value= "other">others</option>
  </select>
 
 Fav Sport Team<input type="text" name="team">
 
 Fav Sportsmen<input type="text" name="sportsmen">
 
 No of trophies<input type="number" name="trophy" min="1" max="5">
 
 Fav opposition <input type="text" name="oppo" >
 
Movie <input type="text" name="movie" >

 Movie genre 
 <select name="mgenre">
  <option value="">Select an option</option>
  <option value="anime">Anime</option>
  <option value="Action">Action</option>
    <option value="horror">horror</option>
  <option value="Feel good">Feel good</option>
  <option value= "other">others</option>
  </select>
 
 Director  <input type="text" name="director" >
 
 Actor<input type="text" name="actor" >
 
 Actress<input type="text" name="actress" >
 
 Movie role <input type="text" name="mrole" >
 
 Music <input type="text" name="music" >
 Musician<input type="text" name="musician" >
 Song<input type="text" name="song" >
 Singer<input type="text" name="singer" >
 
 Wrestling league
 <select name="wleague">
  <option value="">Select an option</option>
  <option value="ufc">UFC</option>
  <option value="one">ONE</option>
    <option value="wwe">WWE</option>
  <option value= "others">others</option>
  </select>
 Wrestling form
 <select name="wform">
  <option value="">Select an option</option>
  <option value="ufc">MMA</option>
  <option value="jiu jitsu">Jiu jitsu</option>
    <option value="taekwondo">taekwondo</option>
  <option value= "others1">others</option>
  </select>
 
 Wrestler<input type="text" name="wrestler" >
 
 Bank Name<input type="text" name="bank" >
 
 Podcast topic<input type="text" name="tpodcast" >
 Podcast <input type="text" name="podcast" >
 Podcaster<input type="text" name="podcaster" >
 
 Mobile <input type="text" name="mobileb" >
 Series<input type="text" name="series" >
 laptop<input type="text" name="laptop" >
 Fav color<input type="text" name="color" >
 Fav Food<input type="text" name="food" >
 Fav hotel<input type="text" name="hotel" >
 Fav Tv Show<input type="text" name="TvShow" >
 Fav character<input type="text" name="char" >
 Fav youtuber<input type="text" name="youtuber" >
 Fav youtube channel<input type="text" name="youtuberc" >
 Fav quote  <input type="text" name="quote" >
 book genre<input type="text" name="bookg" >
 Book<input type="text" name="book" >
 Fav vacation spot<input type="text" name="spot" >
 dream vaction<input type="text" name="dvac" >
 dream pet<input type="text" name="pet" >
 dream job<input type="text" name="job" >
  dream car <input type="text" name="car" >
 
 


<input type="submit" value="send">

</pre>

	</form>
</div>


</body>
</html>