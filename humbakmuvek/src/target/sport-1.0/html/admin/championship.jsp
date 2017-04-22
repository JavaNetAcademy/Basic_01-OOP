<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">Bajnokság létrehozása</h3>
    </div>
    <div class="panel-body">
        <!-- Nav tabs -->
        <ul class="nav nav-tabs" role="tablist">
            <li role="presentation" class="active"><a href="#basic" aria-controls="basic" role="tab" data-toggle="tab">Nyilvántartási adatok</a></li>
            <li role="presentation"><a href="#condition" aria-controls="condition" role="tab" data-toggle="tab">Sport</a></li>
            <li role="presentation"><a href="#round" aria-controls="round" role="tab" data-toggle="tab">Fordulók</a></li>
            <li role="presentation"><a href="#race" aria-controls="race" role="tab" data-toggle="tab">Futamok</a></li>
        </ul>

        <!-- Tab panes -->
        <div class="tab-content">
            <div role="tabpanel" class="tab-pane active" id="basic"><jsp:include page="championship_basic.jsp" /></div>
            <div role="tabpanel" class="tab-pane" id="condition"><jsp:include page="championship_conditions.jsp" /></div>
            <div role="tabpanel" class="tab-pane" id="round"><jsp:include page="cahmpionship_rounds.jsp" /></div>
            <div role="tabpanel" class="tab-pane" id="race"> </div>
        </div>
    </div>
</div>


<script>
    window.onload = function () {
        loadSelect(["#season"], "season/idname/all");
        loadSelect(["#seria"], "seria/idname/all");
        loadSelect(["#sport"], "sport/idname/all");
        loadSelect(["#championship","#tmpchampionship"], "championship/idname/all");
        loadPicklist("#conditions", "condition/picklist/0")

        $('#datetimepicker6').datetimepicker();
        $('#datetimepicker7').datetimepicker({
            useCurrent: false //Important! See issue #1075
        });
        $("#datetimepicker6").on("dp.change", function (e) {
            $('#datetimepicker7').data("DateTimePicker").minDate(e.date);
        });
        $("#datetimepicker7").on("dp.change", function (e) {
            $('#datetimepicker6').data("DateTimePicker").maxDate(e.date);
        });

        $('.add').click(function () {
            $('.all').prop("checked", false);
            var items = $("#list1 input:checked:not('.all')");
            var n = items.length;
            if (n > 0) {
                items.each(function (idx, item) {
                    var choice = $(item);
                    choice.prop("checked", false);
                    choice.parent().appendTo("#list2");
                });
            }
            else {
                alert("Choose an item from list 1");
            }
        });

        $('.remove').click(function () {
            $('.all').prop("checked", false);
            var items = $("#list2 input:checked:not('.all')");
            items.each(function (idx, item) {
                var choice = $(item);
                choice.prop("checked", false);
                choice.parent().appendTo("#list1");
            });
        });

        /* toggle all checkboxes in group */
        $('.all').click(function (e) {
            e.stopPropagation();
            var $this = $(this);
            if ($this.is(":checked")) {
                $this.parents('.list-group').find("[type=checkbox]").prop("checked", true);
            }
            else {
                $this.parents('.list-group').find("[type=checkbox]").prop("checked", false);
                $this.prop("checked", false);
            }
        });

        $('[type=checkbox]').click(function (e) {
            e.stopPropagation();
        });

        /* toggle checkbox when list group item is clicked */
        $('.list-group a').click(function (e) {

            e.stopPropagation();

            var $this = $(this).find("[type=checkbox]");
            if ($this.is(":checked")) {
                $this.prop("checked", false);
            }
            else {
                $this.prop("checked", true);
            }

            if ($this.hasClass("all")) {
                $this.trigger('click');
            }
        });

    }
</script>

</body>
</html>
