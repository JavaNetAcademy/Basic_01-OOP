<form method="post" action="/sport/rest/championship/save" onsubmit="send(this);
        loadSelect(['#championship','#tmpchampionship'], 'championship/idname/all');
        return false;">
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
            <span class="input-group-addon" id="sizing-addon1">Dátum:</span>
        </div><!-- /.col-lg-3 -->
        <div class="col-md-3">
            <div class='input-group date' id='datetimepicker6'>
                <input type='text' name="startDate" class="form-control" />
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
            </div>
        </div><!-- /.col-lg-3 -->
        <div class="col-md-3">
            <div class='input-group date' id='datetimepicker7'>
                <input type='text' name="endDate" class="form-control" />
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
            </div>
        </div><!-- /.col-lg-3 -->
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
            <span class="input-group-addon" id="sizing-addon1">Season:</span>
        </div><!-- /.col-lg-6 -->
        <div class="col-md-9">
            <select name="seasonid" id="season" class="form-control" placeholder="Socker" aria-describedby="sizing-addon1"></select>
        </div><!-- /.col-lg-9 -->
    </div><!-- /.row -->            

    <div class="row">
        <div class="col-md-3">
            <span class="input-group-addon" id="sizing-addon1">Seria</span>
        </div><!-- /.col-lg-6 -->
        <div class="col-md-9">
            <select name="seriaid" id="seria" class="form-control" placeholder="Socker" aria-describedby="sizing-addon1"></select>
        </div><!-- /.col-lg-9 -->
    </div><!-- /.row -->

    <div class="row" id="conditions">
        <div class="col-md-12 text-center"><h3>Megszorítások</h3></div>
        <div class="col-sm-4 col-sm-offset-1">
            <div class="list-group" id="list1">
                <a href="#" class="list-group-item active">Elérheto <input title="toggle all" class="all pull-right" type="checkbox"></a>
            </div>
        </div>
        <div class="col-md-2 v-center">
            <div title="Send to list 2" class="btn btn-default center-block add"><i class="glyphicon glyphicon-chevron-right"></i></div>
            <div title="Send to list 1" class="btn btn-default center-block remove"><i class="glyphicon glyphicon-chevron-left"></i></div>
        </div>
        <div class="col-sm-4">
            <div class="list-group" id="list2">
                <a href="#" class="list-group-item active">Kiválasztott <input title="toggle all" class="all pull-right" type="checkbox"></a>
            </div>
        </div>
    </div>    
    
    <div class="btn-group" role="group" aria-label="...">
        <input type="submit" class="btn btn-default" value="Felvitel" /></button>            
    </div>
</form>