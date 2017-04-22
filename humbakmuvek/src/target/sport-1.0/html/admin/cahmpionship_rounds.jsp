<div class="row">
        <div class="col-md-3">
            <span class="input-group-addon" id="sizing-addon1">Bajnokság:</span>
        </div><!-- /.col-lg-6 -->
        <div class="col-md-9">
            <select name="" id="tmpchampionship" class="form-control" aria-describedby="sizing-addon1"
                    onchange="loadSelect(['#event'], 'championship/events/idname/' + document.querySelector('#tmpchampionship').value);"></select>
        </div><!-- /.col-lg-9 -->
    </div><!-- /.row -->    

<form method="post" action="/sport/rest/championship/addround" onsubmit="return send(this);">
    <div class="row">
        <div class="col-md-3">
            <span class="input-group-addon" id="sizing-addon1">Esemény:</span>
        </div><!-- /.col-lg-6 -->
        <div class="col-md-9">
            <select name="eventid" id="event" class="form-control" aria-describedby="sizing-addon1"></select>
        </div><!-- /.col-lg-9 -->
    </div><!-- /.row -->            

    <div class="panel panel-default">
        <div class="panel-heading">Új Forduló</button></div>
        <div class="panel-body">
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

        </div>
    </div>

    <div class="btn-group" role="group" aria-label="...">
        <input type="submit" class="btn btn-default" value="Felvitel" /></button>            
    </div>
</form>    