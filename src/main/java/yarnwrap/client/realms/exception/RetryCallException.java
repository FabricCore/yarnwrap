package yarnwrap.client.realms.exception;
public class RetryCallException { public net.minecraft.client.realms.exception.RetryCallException wrapperContained; public RetryCallException(net.minecraft.client.realms.exception.RetryCallException wrapperContained) { this.wrapperContained = wrapperContained; }

public int delaySeconds() { return wrapperContained.delaySeconds; }
// public void delaySeconds(int value) { wrapperContained.delaySeconds = value; }
// public static int delaySeconds() { return net.minecraft.client.realms.exception.RetryCallException.delaySeconds; }
// public static void delaySeconds(int value, ) { net.minecraft.client.realms.exception.RetryCallException.delaySeconds = value; }

// public int DEFAULT_DELAY_SECONDS() { return wrapperContained.DEFAULT_DELAY_SECONDS; }
// public void DEFAULT_DELAY_SECONDS(int value) { wrapperContained.DEFAULT_DELAY_SECONDS = value; }
public static int DEFAULT_DELAY_SECONDS() { return net.minecraft.client.realms.exception.RetryCallException.DEFAULT_DELAY_SECONDS; }
// public static void DEFAULT_DELAY_SECONDS(int value, ) { net.minecraft.client.realms.exception.RetryCallException.DEFAULT_DELAY_SECONDS = value; }

public RetryCallException(int delaySeconds,int httpResultCode) { this.wrapperContained = new net.minecraft.client.realms.exception.RetryCallException(delaySeconds,httpResultCode); }

}