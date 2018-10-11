package it.caladyon.bethelwhite.hardmock.expectnew;

import static org.junit.Assert.*;

import org.easymock.Capture;
import org.easymock.EasyMock;
import org.easymock.IAnswer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.api.support.membermodification.MemberMatcher;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ OuterLogic.class, InnerLogic.class })
public class OuterLogicWithInnerLogicTest {

    @Test
    public void testExecute() throws Exception {

        // InnerLogic innerLogicMock = PowerMock.createPartialMock(InnerLogic.class,
        // "validate");
        // EasyMock.expect(innerLogicMock.validate(EasyMock.anyString())).andReturn(true).once();

        Capture<Integer> c1 = EasyMock.newCapture();
        PowerMock.expectNew(InnerLogic.class, new Class[] { int.class }, new Object[] { EasyMock.capture(c1) })
                .andAnswer(new IAnswer<InnerLogic>() {

                    @Override
                    public InnerLogic answer() throws Throwable {
                        InnerLogic rv = new InnerLogic(c1.getValue().intValue());
                        PowerMock.stub(MemberMatcher.method(InnerLogic.class, "validate")).toReturn(true);
                        //PowerMock.replay(rv);
                        return rv;
                    }
                });
        
        PowerMock.replay(InnerLogic.class);
        
        OuterLogic outerLogic = new OuterLogic();
        int result = outerLogic.execute("dummy", 100, 1000);
        
        PowerMock.verifyAll();
        assertTrue(result < 0); // because seed < number
    }

}
