package yarnwrap.network;
public class RateLimitedConnection { public net.minecraft.network.RateLimitedConnection wrapperContained; public RateLimitedConnection(net.minecraft.network.RateLimitedConnection wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.text.Text RATE_LIMIT_EXCEEDED_MESSAGE() { return new yarnwrap.text.Text(wrapperContained.RATE_LIMIT_EXCEEDED_MESSAGE); }
// public int rateLimit() { return wrapperContained.rateLimit; }

}