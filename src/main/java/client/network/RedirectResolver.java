package yarnwrap.client.network;
public class RedirectResolver { public net.minecraft.client.network.RedirectResolver wrapperContained; public RedirectResolver(net.minecraft.client.network.RedirectResolver wrapperContained) { this.wrapperContained = wrapperContained; }

public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public yarnwrap.client.network.RedirectResolver INVALID() { return new yarnwrap.client.network.RedirectResolver(wrapperContained.INVALID); }
// public yarnwrap.client.network.RedirectResolver createSrv() { return new yarnwrap.client.network.RedirectResolver(wrapperContained.createSrv()); }

}