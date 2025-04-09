package yarnwrap.client.gui.screen.world;
public class WorldListWidget { public net.minecraft.client.gui.screen.world.WorldListWidget wrapperContained; public WorldListWidget(net.minecraft.client.gui.screen.world.WorldListWidget wrapperContained) { this.wrapperContained = wrapperContained; }

public java.time.format.DateTimeFormatter DATE_FORMAT() { return wrapperContained.DATE_FORMAT; }
// public yarnwrap.text.Text FROM_NEWER_VERSION_FIRST_LINE() { return new yarnwrap.text.Text(wrapperContained.FROM_NEWER_VERSION_FIRST_LINE); }
// public yarnwrap.text.Text FROM_NEWER_VERSION_SECOND_LINE() { return new yarnwrap.text.Text(wrapperContained.FROM_NEWER_VERSION_SECOND_LINE); }
// public yarnwrap.text.Text SNAPSHOT_FIRST_LINE() { return new yarnwrap.text.Text(wrapperContained.SNAPSHOT_FIRST_LINE); }
// public yarnwrap.text.Text SNAPSHOT_SECOND_LINE() { return new yarnwrap.text.Text(wrapperContained.SNAPSHOT_SECOND_LINE); }
// public yarnwrap.text.Text LOCKED_TEXT() { return new yarnwrap.text.Text(wrapperContained.LOCKED_TEXT); }
// public yarnwrap.client.gui.screen.world.SelectWorldScreen parent() { return new yarnwrap.client.gui.screen.world.SelectWorldScreen(wrapperContained.parent); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.text.Text CONVERSION_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.CONVERSION_TOOLTIP); }
// public Object loadingEntry() { return wrapperContained.loadingEntry; }
// public java.lang.String search() { return wrapperContained.search; }
// public java.util.concurrent.CompletableFuture levelsFuture() { return wrapperContained.levelsFuture; }
// public java.util.List levels() { return wrapperContained.levels; }
// public yarnwrap.text.Text EXPERIMENTAL_TEXT() { return new yarnwrap.text.Text(wrapperContained.EXPERIMENTAL_TEXT); }
// public yarnwrap.util.Identifier ERROR_HIGHLIGHTED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.ERROR_HIGHLIGHTED_TEXTURE); }
// public yarnwrap.util.Identifier ERROR_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.ERROR_TEXTURE); }
// public yarnwrap.util.Identifier MARKED_JOIN_HIGHLIGHTED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.MARKED_JOIN_HIGHLIGHTED_TEXTURE); }
// public yarnwrap.util.Identifier MARKED_JOIN_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.MARKED_JOIN_TEXTURE); }
// public yarnwrap.util.Identifier WARNING_HIGHLIGHTED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.WARNING_HIGHLIGHTED_TEXTURE); }
// public yarnwrap.util.Identifier WARNING_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.WARNING_TEXTURE); }
// public yarnwrap.util.Identifier JOIN_HIGHLIGHTED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.JOIN_HIGHLIGHTED_TEXTURE); }
// public yarnwrap.util.Identifier JOIN_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.JOIN_TEXTURE); }
// public yarnwrap.text.Text INCOMPATIBLE_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.INCOMPATIBLE_TOOLTIP); }
public java.util.Optional getSelectedAsOptional() { return wrapperContained.getSelectedAsOptional(); }
public yarnwrap.client.gui.screen.world.SelectWorldScreen getParent() { return new yarnwrap.client.gui.screen.world.SelectWorldScreen(wrapperContained.getParent()); }
// public boolean shouldShow(java.lang.String search,yarnwrap.world.level.storage.LevelSummary summary) { return wrapperContained.shouldShow(search,summary.wrapperContained); }
// public void showSummaries(java.lang.String search,java.util.List summaries) { wrapperContained.showSummaries(search,summaries); }
// public void showUnableToLoadScreen(yarnwrap.text.Text message) { wrapperContained.showUnableToLoadScreen(message.wrapperContained); }
// public java.util.concurrent.CompletableFuture loadLevels() { return wrapperContained.loadLevels(); }
// public void showLoadingScreen() { wrapperContained.showLoadingScreen(); }
// public void narrateScreenIfNarrationEnabled() { wrapperContained.narrateScreenIfNarrationEnabled(); }
public void setSearch(java.lang.String search) { wrapperContained.setSearch(search); }
// public void show(java.util.List levels) { wrapperContained.show(levels); }
// public java.util.List tryGet() { return wrapperContained.tryGet(); }
// public void load() { wrapperContained.load(); }

}