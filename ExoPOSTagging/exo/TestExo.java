package exo;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class TestExo {
	
	/*travail sur les asserts + JUnit*/
	
	@Test
	public void simpleTaggedWord() {
		TaggedWord tw = new TaggedWord("dormait","VRB");
		//idéalement un seul Assert par test
        Assert.assertEquals("dormait", tw.getWord());
        Assert.assertEquals("VRB", tw.getPOS());
	}
	
	@Test
	public void testGetWord() {
		TaggedWord tw = new TaggedWord("grande","ADJ");
		Assert.assertEquals("grande", tw.getWord());
	}
	
	@Test
	public void testGetPOS() {
		TaggedWord tw = new TaggedWord("grande","ADJ");
		Assert.assertEquals("ADJ", tw.getPOS());
	}
	
	@Test
	public void lengthTaggedText() throws IOException {
		TaggedText duchesne = new TaggedText("/Users/milena/Documents/Travail/M2TAL/java/pereduchene.tagged");	
		Assert.assertEquals(1551, duchesne.size());
	}
	
	@Test
	public void contentTaggedText() throws IOException {
		TaggedText duchesne = new TaggedText("/Users/milena/Documents/Travail/M2TAL/java/pereduchene.tagged");	
		Assert.assertEquals("[[word=invite ; pos=VER:pres]]", duchesne.slice(1224, 1225).toString());
	}
}
