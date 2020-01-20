Feature: esse recurso testara procura na lupa 

@Busca_Na_Lupa
Scenario: Busca Objeto em search
	Given o usuario esta na Pagina Inicial 
	When o usuario clica em procurar 
	And o usuario vai procurar por tablets
	Then o usuario vaie escolhe o seu tablet
	
	
     