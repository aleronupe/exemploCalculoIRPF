package testes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import testes.contribuintes.AllTestsContribuintes;
import testes.deducoes.AllTestsDeducoes;
import testes.rendimentos.AllTestsRendimentos;

@RunWith(Suite.class)
@SuiteClasses({AllTestsContribuintes.class, AllTestsRendimentos.class, AllTestsDeducoes.class})
public class AllTests {

}
