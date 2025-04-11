package yarnwrap.client.session;
public class BanReason { public net.minecraft.client.session.BanReason wrapperContained; public BanReason(net.minecraft.client.session.BanReason wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text description() { return new yarnwrap.text.Text(wrapperContained.description); }
// public void description(yarnwrap.text.Text value) { wrapperContained.description = value.wrapperContained; }
public yarnwrap.text.Text getDescription() { return new yarnwrap.text.Text(wrapperContained.getDescription()); }
public yarnwrap.client.session.BanReason byId(int id) { return new yarnwrap.client.session.BanReason(wrapperContained.byId(id)); }

}