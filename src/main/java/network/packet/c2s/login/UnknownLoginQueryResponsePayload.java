package yarnwrap.network.packet.c2s.login;
public class UnknownLoginQueryResponsePayload { public net.minecraft.network.packet.c2s.login.UnknownLoginQueryResponsePayload wrapperContained; public UnknownLoginQueryResponsePayload(net.minecraft.network.packet.c2s.login.UnknownLoginQueryResponsePayload wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.packet.c2s.login.UnknownLoginQueryResponsePayload INSTANCE() { return new yarnwrap.network.packet.c2s.login.UnknownLoginQueryResponsePayload(wrapperContained.INSTANCE); }

}