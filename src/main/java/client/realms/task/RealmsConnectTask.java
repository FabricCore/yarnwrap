package yarnwrap.client.realms.task;
public class RealmsConnectTask { public net.minecraft.client.realms.task.RealmsConnectTask wrapperContained; public RealmsConnectTask(net.minecraft.client.realms.task.RealmsConnectTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.realms.RealmsConnection realmsConnection() { return new yarnwrap.client.realms.RealmsConnection(wrapperContained.realmsConnection); }
// public yarnwrap.client.realms.dto.RealmsServerAddress address() { return new yarnwrap.client.realms.dto.RealmsServerAddress(wrapperContained.address); }
// public yarnwrap.client.realms.dto.RealmsServer server() { return new yarnwrap.client.realms.dto.RealmsServer(wrapperContained.server); }
// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }

}