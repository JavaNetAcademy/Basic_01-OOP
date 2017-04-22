<div class="row">
        <div class="col-md-3">
            <span class="input-group-addon" id="sizing-addon1">Bajnokság:</span>
        </div><!-- /.col-lg-6 -->
        <div class="col-md-9">
            <select name="" id="tmpchampionship" class="form-control" aria-describedby="sizing-addon1"
                    onchange="loadSelect(['#event'], 'championship/events/idname/' + document.querySelector('#tmpchampionship').value);"></select>
        </div><!-- /.col-lg-9 -->
    </div><!-- /.row -->    

<form method="post" action="/sport/rest/entry/save" onsubmit="return send(this);">
    <div class="row">
        <div class="col-md-3">
            <span class="input-group-addon" id="sizing-addon1">Esemény:</span>
        </div><!-- /.col-lg-6 -->
        <div class="col-md-9">
            <select name="id" id="event" class="form-control" aria-describedby="sizing-addon1"></select>
        </div><!-- /.col-lg-9 -->
    </div><!-- /.row -->            

    

    <div class="btn-group" role="group" aria-label="...">
        <input type="submit" class="btn btn-default" value="Felvitel" /></button>            
    </div>
</form>
    <script>
        loadSelect(["#tmpchampionship"], "championship/idname/all");
        function submit(pForm){
            pForm.action ="/sport/rest/entry/save/"+document.querySelector("#event").value;
            return send(pForm);
        }
    </script>