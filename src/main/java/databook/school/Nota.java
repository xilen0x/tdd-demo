package databook.school;

public class Nota {
	
	private final String subject;
	private double value;
	
	//Constructors
	public Nota(String subject) {
		
		this.subject = subject;
	}
		
	public Nota(double value, String subject) {
		
		this.subject = subject;
		this.value = value;
	}



	//Methods
	public boolean isSameSubject(Nota nota) {
		
		return this.subject.equals(nota.subject);
	}
	
	public boolean isSameValue(Nota nota) {
		
		return this.value == nota.value;
	}

	
	@Override
	public boolean equals(Object object) {
		return this.isSameSubject((Nota)object) &&
				this.isSameValue((Nota)object);
	}
	
	public enum Categorical {
		D, C, B, A
	}
	
	public Categorical getCategoricalNota() {
		
		if(this.value >=0.0 && this.value < 4.0)
			return Categorical.D;
		
		else if(this.value >=4.0 && this.value < 5.0)
			return Categorical.C;
		
		else if(this.value >=5.0 && this.value < 8.5)
			return Categorical.B;
		
		else if(this.value >=8.5 && this.value <= 10)
			return Categorical.A;
		
		return null;
	}

}
