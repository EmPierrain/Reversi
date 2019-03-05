$(function() {
	$('#game-link').on(
			'click',
			function() {
				$(this).attr(
						'alt',
						$('#save-unquoted-url').val()
								+ $('#last-displayed-quote').val());
			});
	$('.action-link').on('click', function() {
		$('#content-displayed').load($(this).attr('alt'));
		$('.nav > .active').removeClass('active');
		$(this).parent().addClass('active');
	});

	$('.neutral').on(
    			'click',
    			function(event) {
    				event.target.style.backgroundColor = 'white';
                    $.get("/rest/gameUpdate",{
                        caseId: event.target.id,
                        player: "white",
                        gameId: "4"
                    })
    				alert(event.target.id);
    			})

});
