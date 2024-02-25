/*
 * Created on May 6, 2004
 *
 * 
 */
package net.myvietnam.mvncore.thirdparty.aspirin.masukomi.aspirin.core;

import java.util.Collection;

import javax.mail.internet.MimeMessage;

import net.myvietnam.mvncore.thirdparty.aspirin.apache.mailet.MailAddress;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @author masukomi
 *
 * This class is provided mainly as an example. It will notify you when *a* message succeeds 
 * or fails but doesn't take the recipients into account and it doesn't care *what* message has
 * succeeded or failed. It is extremely simplistic and should not be used as a guage of what a 
 * sophisticated MailWatcher is capable of. 
 */
public class SimpleMailWatcherImpl implements MailWatcher {
	static private Logger log = LoggerFactory.getLogger(SimpleMailWatcherImpl.class);
	boolean hasSucceeded = false;
	boolean hasFailed = false;
	MimeMessage message;
	/** a collection of import org.apache.mailet.MailAddress objects relating to the e-mail */
	Collection recipients;
	MailAddress lastRecipient;
	/**
	 * 
	 */
	public SimpleMailWatcherImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SimpleMailWatcherImpl(MimeMessage message) {
		super();
		this.message = message;
		// TODO Auto-generated constructor stub
	}
	
	/** 
	 * @deprecated
	 * @see org.masukomi.aspirin.core.MailWatcher#deliverySuccess(javax.mail.internet.MimeMessage, java.util.Collection)
	 */
	public void deliverySuccess(MimeMessage message, Collection recipients) {
		if (this.message == null){
			hasSucceeded = true;
			this.recipients = recipients;
			MailQue.removeWatcher(this);
		} else if (this.message == message) {
			hasSucceeded = true;
			this.recipients = recipients;
			MailQue.removeWatcher(this);
		}
		
	}

	/**@deprecated
	 * @see org.masukomi.aspirin.core.MailWatcher#deliveryFailure(javax.mail.internet.MimeMessage, java.util.Collection)
	 */
	public void deliveryFailure(MimeMessage message, Collection recipients) {
		if (this.message == null){
			hasFailed = true;
			this.recipients = recipients;
			MailQue.removeWatcher(this);
		} else if (this.message == message) {
			hasFailed = true;
			this.recipients = recipients;
			MailQue.removeWatcher(this);
		}
		
	}
	
	/** 
	 * Warning: this method may take a long time to return while a message is sending.
	 * @return true if the delivery succeeds
	 * 
	 */
	public boolean blockingSuccessCheck(){
		while(hasFailed == false && hasSucceeded == false){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				log.error(e1.toString());
			}
		}
		return hasSucceeded;
	}
	
	public void resetTestValues(){
		hasSucceeded=false;
		hasFailed=false;
	}
	/**
	 * @return Returns the message.
	 */
	public MimeMessage getMessage() {
		return message;
	}
	/**
	 * @return Returns the recipients.
	 */
	public Collection getRecipients() {
		return recipients;
	}
	/* (non-Javadoc)
	 * @see org.masukomi.aspirin.core.MailWatcher#deliverySuccess(javax.mail.internet.MimeMessage, org.apache.mailet.MailAddress)
	 */
	public void deliverySuccess(MimeMessage message, MailAddress recipient) {
		if (this.message == null){
			hasSucceeded = true;
			lastRecipient = recipient;
			MailQue.removeWatcher(this);
		} else if (this.message == message) {
			hasSucceeded = true;
			lastRecipient = recipient;
			MailQue.removeWatcher(this);
		}
		
	}
	/* (non-Javadoc)
	 * @see org.masukomi.aspirin.core.MailWatcher#deliveryFailure(javax.mail.internet.MimeMessage, org.apache.mailet.MailAddress)
	 */
	public void deliveryFailure(MimeMessage message, MailAddress recipient) {
		if (this.message == null){
			hasFailed = true;
			lastRecipient = recipient;
			MailQue.removeWatcher(this);
		} else if (this.message == message) {
			hasFailed = true;
			lastRecipient = recipient;
			MailQue.removeWatcher(this);
		}
	}
}
