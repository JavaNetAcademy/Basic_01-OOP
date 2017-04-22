

<form method="post" action="/sport/rest/sportspecialization/save" onsubmit="return send(this);">

    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">Új elem felvitele</h3>
        </div>
        <div class="panel-body">
<div class="row">
    <div class="col-md-3">
        <span class="input-group-addon" id="sizing-addon1">Sport:</span>
    </div><!-- /.col-lg-6 -->
    <div class="col-md-9">
        <select name="parendid" id="sport" class="form-control" placeholder="Socker" aria-describedby="sizing-addon1"></select>
    </div><!-- /.col-lg-9 -->
</div><!-- /.row -->
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

<script>
    window.onload = function () {
        loadSelect(["#sport"], "sport/idname/all");
    }
</script>