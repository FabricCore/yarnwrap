package yarnwrap.client.realms.exception;
public class RetryCallException { public net.minecraft.client.realms.exception.RetryCallException wrapperContained; public RetryCallException(net.minecraft.client.realms.exception.RetryCallException wrapperContained) { this.wrapperContained = wrapperContained; }

public int delaySeconds() { return wrapperContained.delaySeconds; }
public int DEFAULT_DELAY_SECONDS() { return wrapperContained.DEFAULT_DELAY_SECONDS; }

}