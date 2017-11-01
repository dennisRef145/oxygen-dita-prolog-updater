package com.oxygenxml.prolog.updater.dita.editor;

/**
 * Editor for DITA topic.
 * @author intern4
 *
 */
public interface DitaTopicEditor {
	
	/**
	 * Class's value of prolog anterior note.
	 */
	 String FOLLOWING_NODE_CLASS_VALUE = "topic/body";
	
	/**
	 * Update the prolog in DITA topic document according to given flag(isNewDocument)
	 * @param isNewDocument <code>true</code> if document is new, <code>false</code> otherwise
	 * 
	 */
	void updateProlog( boolean isNewDocument);
	
}