function send(pForm) {
    var data = form2JSON(pForm);

    var http = new XMLHttpRequest();
    http.open("POST", pForm.action, true);
    http.setRequestHeader("Content-Type", "application/json");
    http.onload = function () {
        console.log(http.response);
        $('table').bootstrapTable('append', data);
        $('table').bootstrapTable('scrollTo', 'bottom');
    };
    http.onerror = function () {
        console.log("errer");
    };
    http.send(JSON.stringify(data));
    return false;
}

function loadPicklist(pSelector, pResource) {
    var http = new XMLHttpRequest();
    http.open("GET", "/sport/rest/" + pResource, true);
    http.setRequestHeader("Content-Type", "application/json");
    http.responseType = "json";
    http.onload = function () {
        var element = document.querySelector(pSelector+" .col-sm-offset-1 .list-group");
        //element.innerHTML =""
        for(var i=0;i<http.response.length;i++){
            for(var x in http.response[i].unselected){
                element.innerHTML += '<a href="#" class="list-group-item">'+http.response[i].unselected[x].name+'('+http.response[i].title+')<input class="pull-right" type="checkbox" value="'+http.response[i].unselected[x].id+'" /></a>'
            }
        }
    };
    http.onerror = function () {
        console.log("errer");
    };
    http.send();
}

function loadSelect(pSelectors, pResource) {
    var http = new XMLHttpRequest();
    http.open("GET", "/sport/rest/" + pResource, true);
    http.setRequestHeader("Content-Type", "application/json");
    http.responseType = "json";
    http.onload = function () {
        var select;
        var option;
        for(var x in pSelectors){
            console.log("loadselect:"+pSelectors[x]);
            select = document.querySelector(pSelectors[x]);
            select.options.length = 0
            select.appendChild(document.createElement("OPTION"));
            for (var x in http.response) {
                option = document.createElement("OPTION");
                option.text = http.response[x].name;
                option.value = http.response[x].id;
                select.appendChild(option);
            }
        }
    };
    http.onerror = function () {
        console.log("errer");
    };
    http.send();
}

function form2JSON(pForm) {
    var formArray = pForm.querySelectorAll("[name]");
    var returnArray = {};
    for (var i = 0; i < formArray.length; i++) {
        if (returnArray[formArray[i]['name']] != null) {
            if (!Array.isArray(returnArray[formArray[i]['name']])) {
                var tmp = returnArray[formArray[i]['name']];
                returnArray[formArray[i]['name']] = [];
                returnArray[formArray[i]['name']].push(tmp);
            }
            if(formArray[i].multiple == null)
                returnArray[formArray[i]['name']].push(formArray[i]['value']);
        }
        else{
            if(!formArray[i]["multiple"] ){
                returnArray[formArray[i]['name']] = formArray[i]['value'];
            }
            else{
                returnArray[formArray[i]['name']] = getSelectValues(formArray[i]);
            }
        }
    }
    console.log(returnArray);
    return returnArray;
}

function getSelectValues(select) {
    var result = [];
    var options = select && select.options;
    var opt;
    var iLen = options.length;
    for (var i = 0; i < iLen; i++) {
        opt = options[i];
        if (opt.selected) {
            result.push(opt.value || opt.text);
        }
    }
    return result;
}
