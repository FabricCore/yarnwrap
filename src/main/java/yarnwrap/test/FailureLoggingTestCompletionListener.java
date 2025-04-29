package yarnwrap.test;
public class FailureLoggingTestCompletionListener { public net.minecraft.test.FailureLoggingTestCompletionListener wrapperContained; public FailureLoggingTestCompletionListener(net.minecraft.test.FailureLoggingTestCompletionListener wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.test.FailureLoggingTestCompletionListener.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.test.FailureLoggingTestCompletionListener.LOGGER = value; }


}