package yarnwrap.client.gui.screen.world;
public class WorldListWidget { public net.minecraft.client.gui.screen.world.WorldListWidget wrapperContained; public WorldListWidget(net.minecraft.client.gui.screen.world.WorldListWidget wrapperContained) { this.wrapperContained = wrapperContained; }

public java.time.format.DateTimeFormatter DATE_FORMAT() { return wrapperContained.DATE_FORMAT; }
// public void DATE_FORMAT(java.time.format.DateTimeFormatter value) { wrapperContained.DATE_FORMAT = value; }
// public yarnwrap.text.Text FROM_NEWER_VERSION_FIRST_LINE() { return new yarnwrap.text.Text(wrapperContained.FROM_NEWER_VERSION_FIRST_LINE); }
// public void FROM_NEWER_VERSION_FIRST_LINE(yarnwrap.text.Text value) { wrapperContained.FROM_NEWER_VERSION_FIRST_LINE = value.wrapperContained; }
// public yarnwrap.text.Text FROM_NEWER_VERSION_SECOND_LINE() { return new yarnwrap.text.Text(wrapperContained.FROM_NEWER_VERSION_SECOND_LINE); }
// public void FROM_NEWER_VERSION_SECOND_LINE(yarnwrap.text.Text value) { wrapperContained.FROM_NEWER_VERSION_SECOND_LINE = value.wrapperContained; }
// public yarnwrap.text.Text SNAPSHOT_FIRST_LINE() { return new yarnwrap.text.Text(wrapperContained.SNAPSHOT_FIRST_LINE); }
// public void SNAPSHOT_FIRST_LINE(yarnwrap.text.Text value) { wrapperContained.SNAPSHOT_FIRST_LINE = value.wrapperContained; }
// public yarnwrap.text.Text SNAPSHOT_SECOND_LINE() { return new yarnwrap.text.Text(wrapperContained.SNAPSHOT_SECOND_LINE); }
// public void SNAPSHOT_SECOND_LINE(yarnwrap.text.Text value) { wrapperContained.SNAPSHOT_SECOND_LINE = value.wrapperContained; }
// public yarnwrap.text.Text LOCKED_TEXT() { return new yarnwrap.text.Text(wrapperContained.LOCKED_TEXT); }
// public void LOCKED_TEXT(yarnwrap.text.Text value) { wrapperContained.LOCKED_TEXT = value.wrapperContained; }
// public yarnwrap.client.gui.screen.world.SelectWorldScreen parent() { return new yarnwrap.client.gui.screen.world.SelectWorldScreen(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.world.SelectWorldScreen value) { wrapperContained.parent = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.text.Text CONVERSION_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.CONVERSION_TOOLTIP); }
// public void CONVERSION_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.CONVERSION_TOOLTIP = value.wrapperContained; }
// public Object loadingEntry() { return wrapperContained.loadingEntry; }
// // public void loadingEntry(Object value) { wrapperContained.loadingEntry = value; }
// public java.lang.String search() { return wrapperContained.search; }
// public void search(java.lang.String value) { wrapperContained.search = value; }
// public java.util.concurrent.CompletableFuture levelsFuture() { return wrapperContained.levelsFuture; }
// public void levelsFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.levelsFuture = value; }
// public java.util.List levels() { return wrapperContained.levels; }
// public void levels(java.util.List value) { wrapperContained.levels = value; }
// public yarnwrap.text.Text EXPERIMENTAL_TEXT() { return new yarnwrap.text.Text(wrapperContained.EXPERIMENTAL_TEXT); }
// public void EXPERIMENTAL_TEXT(yarnwrap.text.Text value) { wrapperContained.EXPERIMENTAL_TEXT = value.wrapperContained; }
// public yarnwrap.util.Identifier ERROR_HIGHLIGHTED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.ERROR_HIGHLIGHTED_TEXTURE); }
// public void ERROR_HIGHLIGHTED_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.ERROR_HIGHLIGHTED_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier ERROR_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.ERROR_TEXTURE); }
// public void ERROR_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.ERROR_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier MARKED_JOIN_HIGHLIGHTED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.MARKED_JOIN_HIGHLIGHTED_TEXTURE); }
// public void MARKED_JOIN_HIGHLIGHTED_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.MARKED_JOIN_HIGHLIGHTED_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier MARKED_JOIN_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.MARKED_JOIN_TEXTURE); }
// public void MARKED_JOIN_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.MARKED_JOIN_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier WARNING_HIGHLIGHTED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.WARNING_HIGHLIGHTED_TEXTURE); }
// public void WARNING_HIGHLIGHTED_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.WARNING_HIGHLIGHTED_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier WARNING_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.WARNING_TEXTURE); }
// public void WARNING_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.WARNING_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier JOIN_HIGHLIGHTED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.JOIN_HIGHLIGHTED_TEXTURE); }
// public void JOIN_HIGHLIGHTED_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.JOIN_HIGHLIGHTED_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier JOIN_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.JOIN_TEXTURE); }
// public void JOIN_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.JOIN_TEXTURE = value.wrapperContained; }
// public yarnwrap.text.Text INCOMPATIBLE_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.INCOMPATIBLE_TOOLTIP); }
// public void INCOMPATIBLE_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.INCOMPATIBLE_TOOLTIP = value.wrapperContained; }
public WorldListWidget(yarnwrap.client.gui.screen.world.SelectWorldScreen parent,yarnwrap.client.MinecraftClient client,int width,int height,int y,int itemHeight,java.lang.String search,yarnwrap.client.gui.screen.world.WorldListWidget oldWidget) { this.wrapperContained = new net.minecraft.client.gui.screen.world.WorldListWidget(parent.wrapperContained,client.wrapperContained,width,height,y,itemHeight,search,oldWidget.wrapperContained); }
public java.util.Optional getSelectedAsOptional() { return wrapperContained.getSelectedAsOptional(); }
public yarnwrap.client.gui.screen.world.SelectWorldScreen getParent() { return new yarnwrap.client.gui.screen.world.SelectWorldScreen(wrapperContained.getParent()); }
// public boolean shouldShow(java.lang.String search,yarnwrap.world.level.storage.LevelSummary summary) { return wrapperContained.shouldShow(search,summary.wrapperContained); }
// public void showSummaries(java.lang.String search,java.util.List summaries) { wrapperContained.showSummaries(search,summaries); }
// public java.util.List method_43455(java.lang.Throwable throwable) { return wrapperContained.method_43455(throwable); }
// public void showUnableToLoadScreen(yarnwrap.text.Text message) { wrapperContained.showUnableToLoadScreen(message.wrapperContained); }
// public java.util.concurrent.CompletableFuture loadLevels() { return wrapperContained.loadLevels(); }
// public void showLoadingScreen() { wrapperContained.showLoadingScreen(); }
// public void narrateScreenIfNarrationEnabled() { wrapperContained.narrateScreenIfNarrationEnabled(); }
public void setSearch(java.lang.String search) { wrapperContained.setSearch(search); }
// public void show(java.util.List levels) { wrapperContained.show(levels); }
// public java.util.List tryGet() { return wrapperContained.tryGet(); }
// public void load() { wrapperContained.load(); }

}