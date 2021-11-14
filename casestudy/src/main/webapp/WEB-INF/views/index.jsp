
<%@ include file="./header.jspf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<head>
<style>
.mySlides {display:none;}
</style>
</head>

<h1 style="text-align:center">Welcome to Food Hub....</h1>

<div>
  <img class="mySlides" src="https://media.istockphoto.com/photos/pasta-assortment-of-italian-pasta-dishes-including-spaghetti-penne-picture-id1222770403?b=1&k=20&m=1222770403&s=170667a&w=0&h=2zQuj03ANsywpwp16RJi36YKGsgaFoJO07ywjg5y-ws=" style="width:100%">
  <img class="mySlides" src="https://media.istockphoto.com/photos/table-scene-of-assorted-take-out-or-delivery-foods-top-down-view-on-a-picture-id1232401725?b=1&k=20&m=1232401725&s=170667a&w=0&h=r2DaSWRMjud_-gaOPmDsCizCtdYFzdx9NYTeimCcSnc=" style="width:100%">
  <img class="mySlides" src="https://media.istockphoto.com/photos/classic-thai-food-dishes-picture-id1312283557?b=1&k=20&m=1312283557&s=170667a&w=0&h=hXAmitFiH9z0mK3GZdMDbkkcSl8Em84LIIlkHnVhpPE=" style="width:100%">
</div>

<script>
var myIndex = 0;
carousel();

function carousel() {
  var i;
  var x = document.getElementsByClassName("mySlides");
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";  
  }
  myIndex++;
  if (myIndex > x.length) {myIndex = 1}    
  x[myIndex-1].style.display = "block";  
  setTimeout(carousel, 2000); // Change image every 2 seconds
}
</script>
</head>
<body>

</body>
</html>