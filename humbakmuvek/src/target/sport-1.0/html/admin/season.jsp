
<div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">Lista</h3>
        </div>
  <div class="panel-body">
  <table id="eventsTable"
       data-toggle="table"
       data-url="/sport/rest/season/entity/page"
       data-pagination="true"
       data-side-pagination="server"
       data-search="true"
       data-show-refresh="true"
       data-show-toggle="true"
       data-show-columns="true">      
    <thead>
    <tr>
        <th data-field="state" data-checkbox="true"></th>
        <th data-field="name">Name</th>
        <th data-field="description">Description</th>
    </tr>
    </thead>
</table>
  </div>
</div>

<form method="post" action="/sport/rest/season/save" onsubmit="return send(this);">

    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">Új elem felvitele</h3>
        </div>
        <div class="panel-body">

            <div class="input-group input-group-lg">
                <span class="input-group-addon" id="sizing-addon1">Megnevezés:</span>
                <input type="text" name="name" class="form-control" placeholder="Socker" aria-describedby="sizing-addon1">
            </div>


            <div class="input-group input-group-lg">
                <span class="input-group-addon" id="sizing-addon1">Leírás:</span>
                <input type="text" name="description" class="form-control" placeholder="Socker" aria-describedby="sizing-addon1">
            </div>

            <div class="btn-group" role="group" aria-label="...">
                <input type="submit" class="btn btn-default">Felvitel</button>
            </div>
        </div>
    </div>

</form>

   
</body>
</html>
