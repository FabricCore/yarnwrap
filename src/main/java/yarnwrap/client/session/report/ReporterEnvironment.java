package yarnwrap.client.session.report;
public class ReporterEnvironment { public net.minecraft.client.session.report.ReporterEnvironment wrapperContained; public ReporterEnvironment(net.minecraft.client.session.report.ReporterEnvironment wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.session.report.ReporterEnvironment ofIntegratedServer() { return new yarnwrap.client.session.report.ReporterEnvironment(wrapperContained.ofIntegratedServer()); }
public yarnwrap.client.session.report.ReporterEnvironment ofRealm(yarnwrap.client.realms.dto.RealmsServer server) { return new yarnwrap.client.session.report.ReporterEnvironment(wrapperContained.ofRealm(server.wrapperContained)); }
// public yarnwrap.client.session.report.ReporterEnvironment ofServer(Object server) { return new yarnwrap.client.session.report.ReporterEnvironment(wrapperContained.ofServer(server)); }
public yarnwrap.client.session.report.ReporterEnvironment ofThirdPartyServer(java.lang.String ip) { return new yarnwrap.client.session.report.ReporterEnvironment(wrapperContained.ofThirdPartyServer(ip)); }
public Object toClientInfo() { return wrapperContained.toClientInfo(); }
public Object toThirdPartyServerInfo() { return wrapperContained.toThirdPartyServerInfo(); }
public Object toRealmInfo() { return wrapperContained.toRealmInfo(); }
// public java.lang.String getVersion() { return wrapperContained.getVersion(); }

}