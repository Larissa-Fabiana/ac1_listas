
/**
 * 
 */
package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import codigo.Arranjo;

/**
 * @author ferre
 *
 */
public class ArranjoTest {
	@Test
	void test() {
		Arranjo a = new Arranjo();
		int[] lista = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};

		
		assertEquals(510, a.menor(lista), "O menor deve ser 510");
		assertEquals(940, a.maior(lista), "O maior deve ser 940");
		assertEquals(7540, a.soma(lista), "A soma deve ser 7540");
		assertEquals(0, a.repeticoes(lista, 3), "3 aparece 0 vezes");
		assertEquals(1, a.repeticoes(lista, 790), "790 aparece 1 vezes");
		assertEquals(2, a.repeticoes(lista, 940), "940 aparece 2 vezes");
	}
}

