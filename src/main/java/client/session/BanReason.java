package yarnwrap.client.session;
public class BanReason { public net.minecraft.client.session.BanReason wrapperContained; public BanReason(net.minecraft.client.session.BanReason wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text description() { return new yarnwrap.text.Text(wrapperContained.description); }
public yarnwrap.text.Text getDescription() { return new yarnwrap.text.Text(wrapperContained.getDescription()); }
public yarnwrap.client.session.BanReason byId(int id) { return new yarnwrap.client.session.BanReason(wrapperContained.byId(id)); }

}