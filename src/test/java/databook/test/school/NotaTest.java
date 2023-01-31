package databook.test.school;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import databook.school.Nota;
import databook.school.Nota.Categorical;

public class NotaTest {
	
	/* Test: Dadas dos notas, saber si son notas de la misma asignatura o no*/
	
	
	//private Nota nota1, nota2....etc
	//@Before
	
	//----------------EJ. METODO DE TEST 1-------------------
	@Test
	@DisplayName("Asignaturas son iguales o diferentes!")
	void testSameSubject() {
		
		//FASE.1.ARRANGE
		Nota nota1 = new Nota("Math");
		Nota nota2 = new Nota("Math");
		Nota nota3 = new Nota("Dev");
		
		
		//FASE.2.ACT
		//Comparacion nota1 con nota2(asignatura en realidad)
		boolean isSame = nota1.isSameSubject(nota2);
		
		//Comparacion nota1 con nota3
		boolean isSame2 = nota1.isSameSubject(nota3);
		
		//FASE.3.ASSERT
		Assertions.assertTrue(isSame);
		Assertions.assertFalse(isSame2);
		
	}
	
	//----------------EJ. METODO DE TEST 2-------------------
		@Test
		@DisplayName("Nota igual o diferente")
		void testSameNumericValue() {
			
			//FASE.1.ARRANGE
			Nota nota1 = new Nota(6.8, "Math");
			Nota nota2 = new Nota(6.8, "Dev");
			Nota nota3 = new Nota(9.5, "DB");
						
			
			//FASE.2.ACT
			//Comparacion nota1 con nota2
			boolean isSame = nota1.isSameValue(nota2);
			
			//Comparacion nota1 con nota3
			boolean isSame2 = nota1.isSameValue(nota3);
			
			
			//FASE.3.ASSERT
			Assertions.assertTrue(isSame);
			Assertions.assertFalse(isSame2);
			
		}
		
		//----------------EJ. METODO DE TEST 3-------------------
		@Test
		@DisplayName("...comparaciones.")
		void testSameNota() {
			
			//FASE.1.ARRANGE
			Nota nota1 = new Nota(6.8, "Math");
			Nota nota2 = new Nota(6.8, "Math");
			Nota nota3 = new Nota(9.4, "DB");
			Nota nota4 = new Nota(6.8, "DB");
			Nota nota5 = new Nota(9.5, "Math");
						
			
			//FASE.2.ACT
			boolean isSame = nota1.equals(nota2);
			boolean isDifferent1 = nota1.equals(nota3);
			boolean isDifferent2 = nota1.equals(nota4);
			boolean isDifferent3 = nota1.equals(nota5);
			
			
			//FASE.3.ASSERT
			//Assertions.assertEquals(nota1, nota2);
			Assertions.assertTrue(isSame);
			Assertions.assertFalse(isDifferent1);
			Assertions.assertFalse(isDifferent2);
			Assertions.assertFalse(isDifferent3);
			
		}

		//----------------EJ. METODO DE TEST 4-------------------
				@Test
				@DisplayName("Categorical Qualification is A")
				void testCategoricalNotaIsA() {
					
					//FASE.1.ARRANGE
					Nota nota1 = new Nota(8.9, "Math");
								
					
					//FASE.2.ACT
					Categorical cat = nota1.getCategoricalNota();
					
					
					//FASE.3.ASSERT
					Assertions.assertEquals(Categorical.A, cat);
					
					
					
				}
				
				//----------------EJ. METODO DE TEST 5-------------------
				@Test
				@DisplayName("Categorical Qualification is B")
				void testCategoricalNotaIsB() {
					
					//FASE.1.ARRANGE
					Nota nota1 = new Nota(7.5, "Math");
								
					
					//FASE.2.ACT
					Categorical cat = nota1.getCategoricalNota();
					
					
					//FASE.3.ASSERT
					Assertions.assertEquals(Categorical.B, cat);
			
					
				}
				
				//----------------EJ. METODO DE TEST 6-------------------
				@Test
				@DisplayName("Categorical Qualification is C")
				void testCategoricalNotaIsC() {
					
					//FASE.1.ARRANGE
					Nota nota1 = new Nota(4.5, "Math");
								
					
					//FASE.2.ACT
					Categorical cat = nota1.getCategoricalNota();
					
					
					//FASE.3.ASSERT
					Assertions.assertEquals(Categorical.C, cat);
					
					
					
				}
				
				//----------------EJ. METODO DE TEST 7-------------------
				@Test
				@DisplayName("Categorical Qualification is D")
				void testCategoricalNotaIsD() {
					
					//FASE.1.ARRANGE
					Nota nota1 = new Nota(2.3, "Math");
								
					
					//FASE.2.ACT
					Categorical cat = nota1.getCategoricalNota();
					
					
					//FASE.3.ASSERT
					Assertions.assertEquals(Categorical.D, cat);
			
					//tb se puede probar en caso q se pase una nota q no corresp.
					//Assertions.assertNotEquals(Categorical.D, cat);
					
				}
}
