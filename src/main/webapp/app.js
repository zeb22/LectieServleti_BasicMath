function sendValues(param){
    xmlHttp = new XMLHttpRequest();
    xmlHttp.onreadystatechange=callback;
    var url ="operatiiMatematiceAjax" + "?nr1=" + document.getElementById("nr1").value +
        "&nr2=" + document.getElementById("nr2").value +
        "&nr3=" + document.getElementById("nr3").value + "&op=" + param;
    xmlHttp.open("GET",url,true);
    xmlHttp.send();
}

function callback() {
    if(xmlHttp.readyState==4 && xmlHttp.status==200) {
        document.getElementById("resultArea").innerHTML = xmlHttp.responseText;
    }
}


//ajax request with jQuery

function ReadResults() {
    $.ajax({
        url: "readResultsFromDB"
    }).done(function (result) {
        $('#tableArea').find('tbody').html(result);
    })
}


function deleteDataBase() {
    $.ajax({
        url: "deleteDB"
    }).done(function (result) {
        $('#tableArea').find('tbody').html(result);
    })
}