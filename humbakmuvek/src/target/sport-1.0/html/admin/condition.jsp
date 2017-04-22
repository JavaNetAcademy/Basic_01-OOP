


<form method="post" action="/sport/rest/condition/save" onsubmit="return send(this);">
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
                    <select name="sportid" id="sport" class="form-control" placeholder="Socker" aria-describedby="sizing-addon1">
                        <option value="-1">--</option>
                    </select>
                </div><!-- /.col-lg-9 -->
            </div><!-- /.row -->            
            
            <div class="row">
                <div class="col-md-3">
                    <span class="input-group-addon" id="sizing-addon1">Conditiontype:</span>
                </div><!-- /.col-lg-6 -->
                <div class="col-md-9">
                    <select name="typeid" id="conditiontypeid" class="form-control" placeholder="Socker" aria-describedby="sizing-addon1"></select>
                </div><!-- /.col-lg-9 -->
            </div><!-- /.row -->            
            

            <div class="row">
                <div class="col-md-3">
                    <span class="input-group-addon" id="sizing-addon1">Megnevezés:</span>
                </div><!-- /.col-lg-3 -->
                <div class="col-md-9">
                    <input type="text" name="name" class="form-control" placeholder="Socker" aria-describedby="sizing-addon1">
                </div><!-- /.col-lg-9 -->
            </div><!-- /.row -->            

            <div class="row">
                <div class="col-md-3">
                    <span class="input-group-addon" id="sizing-addon1">Leírás:</span>
                </div><!-- /.col-lg-6 -->
                <div class="col-md-9">
                    <input type="text" name="description" class="form-control" placeholder="Socker" aria-describedby="sizing-addon1">
                </div><!-- /.col-lg-9 -->
            </div><!-- /.row -->            

            <div class="row">
                <div class="col-md-3">
                    <span class="input-group-addon" id="sizing-addon1">Egyezik:</span>
                </div><!-- /.col-lg-6 -->
                <div class="col-md-9">
                    <input type="text" name="equal" class="form-control" placeholder="Socker" aria-describedby="sizing-addon1">
                </div><!-- /.col-lg-9 -->
            </div><!-- /.row -->            
            
            <div class="row">
                <div class="col-md-3">
                    <span class="input-group-addon" id="sizing-addon1">min-max</span>
                </div><!-- /.col-lg-3 -->
                <div class="col-md-3">
                    <input type="text" name="minimum" class="form-control" placeholder="Socker" aria-describedby="sizing-addon1">
                </div><!-- /.col-lg-3 -->
                <div class="col-md-3">
                    <input type="text" name="maximum" class="form-control" placeholder="Socker" aria-describedby="sizing-addon1">
                </div><!-- /.col-lg-3 -->
            </div><!-- /.row -->            

            <div class="btn-group" role="group" aria-label="...">
                <input type="submit" class="btn btn-default" value="Felvitel" /></button>            
            </div>
        </div>
    </div>

</form>

<script>
    window.onload = function () {
        loadSelect(["#conditiontypeid"], "conditiontype/idname/all");
        loadSelect(["#sport"], "sport/idname/all");
    }
</script>

</body>
</html>
