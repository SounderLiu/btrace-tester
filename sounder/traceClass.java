
import static com.sun.btrace.BTraceUtils.println;

/**
 * Created by Sounder Liu on 14-3-21.
 */
import com.sun.btrace.annotations.*;
import com.sun.btrace.BTraceUtils;

import static com.sun.btrace.BTraceUtils.*;

    @BTrace public class traceClass {



    /**
     * This script demonstrates the possibility to intercept
     * method calls that are about to be executed from the body of
     * a certain method. This is achieved by using the {@linkplain Kind#CALL}
     * location value.
     */

        @OnMethod(clazz="btraceTester", method="/.*/",
                location=@Location(value=Kind.CALL, clazz="/.*/", method="/.*/"))
        public static void m(@Self Object self, @TargetMethodOrField String method, @ProbeMethodName String probeMethod) { // all calls to the methods with signature "()"
            println(BTraceUtils.Strings.strcat(method, BTraceUtils.Strings.strcat(" in ", probeMethod)));
        }

    }


