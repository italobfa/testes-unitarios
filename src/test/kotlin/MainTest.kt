import org.junit.jupiter.api.*

class MainTest {

    @Test
    @DisplayName("Testa metodo countXO")
    fun testTrueCountXO() {
        Assertions.assertTrue(countXO("xoxo"))
    }

    @Test
    @DisplayName("Testa metodo countXO")
    fun testFalseCountXO() {
        Assertions.assertFalse(countXO("xxooo"))
    }

    @Test
    fun testEqualsCountXO(){
        Assertions.assertEquals(countXO("xxoo"), true)
    }

    @Test
    @DisplayName("Varios testes no metodo countXO")
    fun testAllCountXO() {
        Assertions.assertAll(
            { Assertions.assertTrue(countXO("xoxo")) },
            { Assertions.assertTrue(countXO("xoxoox")) },
            { Assertions.assertFalse(countXO("xxooo")) },
            { Assertions.assertFalse(countXO("xxxooo")) }
        )
    }

    @Test
    @Disabled
    fun exTestFuturo() {

    }

    @Test
    fun vaiFalhar() {
        fail("Preciso terminar esse teste antes de entregar o projeto.")
    }

    @Test
    fun assumption(){
        Assumptions.assumeTrue(countXO("xxoo"))
        //O resto do codigo, so vai rodar se a instrucao a cima passar.
        Assertions.assertTrue(testTrue())
    }

    @Test
    fun exception(){
        assertThrows<NullPointerException> { testNullPoint() }
    }

}