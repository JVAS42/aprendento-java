package modelos;

public class MinhasPreferidas {
	
	public void inclui(Audio audio) {
		if(audio.getClassificacao() >= 9) {
			System.out.println(audio.getTitulo() + " o preferidinho de todos");
		} else {
			System.out.println(audio.getTitulo() + " considerada boa por todos");
		}
	}
	
}
