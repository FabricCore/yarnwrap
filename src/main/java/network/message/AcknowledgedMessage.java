package yarnwrap.network.message;
public class AcknowledgedMessage { public net.minecraft.network.message.AcknowledgedMessage wrapperContained; public AcknowledgedMessage(net.minecraft.network.message.AcknowledgedMessage wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.message.AcknowledgedMessage unmarkAsPending() { return new yarnwrap.network.message.AcknowledgedMessage(wrapperContained.unmarkAsPending()); }

}