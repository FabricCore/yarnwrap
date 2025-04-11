package yarnwrap.network;
public class RateLimitedConnection { public net.minecraft.network.RateLimitedConnection wrapperContained; public RateLimitedConnection(net.minecraft.network.RateLimitedConnection wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.text.Text RATE_LIMIT_EXCEEDED_MESSAGE() { return new yarnwrap.text.Text(wrapperContained.RATE_LIMIT_EXCEEDED_MESSAGE); }
// public void RATE_LIMIT_EXCEEDED_MESSAGE(yarnwrap.text.Text value) { wrapperContained.RATE_LIMIT_EXCEEDED_MESSAGE = value.wrapperContained; }
// public int rateLimit() { return wrapperContained.rateLimit; }
// public void rateLimit(int value) { wrapperContained.rateLimit = value; }
public RateLimitedConnection(int rateLimit) { this.wrapperContained = new net.minecraft.network.RateLimitedConnection(rateLimit); }

}