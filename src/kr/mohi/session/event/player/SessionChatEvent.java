package kr.mohi.session.event.player;

import cn.nukkit.command.CommandSender;
import cn.nukkit.event.Cancellable;
import kr.mohi.session.Session;

/**
 * @author 110EIm
 * @since 2016-07-17
 */
public class SessionChatEvent extends SessionPlayerEvent implements Cancellable{
    private String messgae;
    private String format;

    public SessionChatEvent(Session session, CommandSender player, String message, String format) {
        super(session, player);
        this.messgae = message;
        this.format = format;
    }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getMessage() {
        return this.messgae;
    }

    public void setMessage(String message) {
        this.messgae = message;
    }
}
