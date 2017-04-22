<form method="post" action="/sport/rest/championship/addsport" onsubmit="return send(this);">

    <div class="row">
        <div class="col-md-3">
            <span class="input-group-addon" id="sizing-addon1">Bajnokság:</span>
        </div><!-- /.col-lg-6 -->
        <div class="col-md-9">
            <select name="championshipid" id="championship" class="form-control" aria-describedby="sizing-addon1"></select>
        </div><!-- /.col-lg-9 -->
    </div><!-- /.row -->            

    <div class="row">
        <div class="col-md-3">
            <span class="input-group-addon" id="sizing-addon1">Sport:</span>
        </div><!-- /.col-lg-6 -->
        <div class="col-md-9">
            <select name="sportid" id="sport" class="form-control" onchange="
                    loadSelect(['#specialization'], 'sportspecialization/idname/' + document.querySelector('#sport').value);
            " aria-describedby="sizing-addon1"></select>
        </div><!-- /.col-lg-9 -->
    </div><!-- /.row -->            

    <div class="row">
        <div class="col-md-3">
            <span class="input-group-addon" id="sizing-addon1">Specializáció</span>
        </div><!-- /.col-lg-6 -->
        <div class="col-md-9">
            <select name="specializationid" multiple="" id="specialization" class="form-control" placeholder="Socker" aria-describedby="sizing-addon1">
            </select>
        </div><!-- /.col-lg-9 -->
    </div><!-- /.row -->            

    <div class="row" id="cconditions">
        <div class="col-md-12 text-center"><h3>Megszorítások</h3></div>
        <div class="col-sm-4 col-sm-offset-1">
            <div class="list-group" id="list1">
                <a href="#" class="list-group-item active">List 1 <input title="toggle all" class="all pull-right" type="checkbox"></a>
            </div>
        </div>
        <div class="col-md-2 v-center">
            <div title="Send to list 2" class="btn btn-default center-block add"><i class="glyphicon glyphicon-chevron-right"></i></div>
            <div title="Send to list 1" class="btn btn-default center-block remove"><i class="glyphicon glyphicon-chevron-left"></i></div>
        </div>
        <div class="col-sm-4">
            <div class="list-group" id="list2">
                <a href="#" class="list-group-item active">List 2 <input title="toggle all" class="all pull-right" type="checkbox"></a>
            </div>
        </div>
    </div>
    <div class="btn-group" role="group" aria-label="...">
        <input type="submit" class="btn btn-default" value="Felvitel" /></button>            
    </div>
</form>