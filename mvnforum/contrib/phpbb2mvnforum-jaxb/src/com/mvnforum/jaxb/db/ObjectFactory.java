//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.12.29 at 03:19:11 PM GMT+07:00 
//


package com.mvnforum.jaxb.db;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mvnforum.jaxb.db package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
public class ObjectFactory
    extends com.mvnforum.jaxb.db.impl.runtime.DefaultJAXBContextImpl
{

    private static java.util.HashMap defaultImplementations = new java.util.HashMap(51, 0.75F);
    private static java.util.HashMap rootTagMap = new java.util.HashMap();
    public final static com.mvnforum.jaxb.db.impl.runtime.GrammarInfo grammarInfo = new com.mvnforum.jaxb.db.impl.runtime.GrammarInfoImpl(rootTagMap, defaultImplementations, (com.mvnforum.jaxb.db.ObjectFactory.class));
    public final static java.lang.Class version = (com.mvnforum.jaxb.db.impl.JAXBVersion.class);

    static {
        defaultImplementations.put((com.mvnforum.jaxb.db.CategoryWatchList.class), "com.mvnforum.jaxb.db.impl.CategoryWatchListImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.GlobalPermissionList.class), "com.mvnforum.jaxb.db.impl.GlobalPermissionListImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.MemberType.class), "com.mvnforum.jaxb.db.impl.MemberTypeImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.RankType.class), "com.mvnforum.jaxb.db.impl.RankTypeImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.ThreadList.class), "com.mvnforum.jaxb.db.impl.ThreadListImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.GroupMemberType.class), "com.mvnforum.jaxb.db.impl.GroupMemberTypeImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.ThreadWatchList.class), "com.mvnforum.jaxb.db.impl.ThreadWatchListImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.AttachmentList.class), "com.mvnforum.jaxb.db.impl.AttachmentListImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.ForumList.class), "com.mvnforum.jaxb.db.impl.ForumListImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.FavoriteThreadList.class), "com.mvnforum.jaxb.db.impl.FavoriteThreadListImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.MvnforumType.RankListType.class), "com.mvnforum.jaxb.db.impl.MvnforumTypeImpl.RankListTypeImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.MessageFolderList.class), "com.mvnforum.jaxb.db.impl.MessageFolderListImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.MessageType.class), "com.mvnforum.jaxb.db.impl.MessageTypeImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.MvnforumType.class), "com.mvnforum.jaxb.db.impl.MvnforumTypeImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.GlobalWatchType.class), "com.mvnforum.jaxb.db.impl.GlobalWatchTypeImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.PostType.class), "com.mvnforum.jaxb.db.impl.PostTypeImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.MemberForumPermissionList.class), "com.mvnforum.jaxb.db.impl.MemberForumPermissionListImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.FavoriteThreadType.class), "com.mvnforum.jaxb.db.impl.FavoriteThreadTypeImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.ThreadType.class), "com.mvnforum.jaxb.db.impl.ThreadTypeImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.GlobalWatchList.class), "com.mvnforum.jaxb.db.impl.GlobalWatchListImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.GroupType.class), "com.mvnforum.jaxb.db.impl.GroupTypeImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.MvnforumType.MemberListType.class), "com.mvnforum.jaxb.db.impl.MvnforumTypeImpl.MemberListTypeImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.GroupForumPermissionList.class), "com.mvnforum.jaxb.db.impl.GroupForumPermissionListImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.MvnforumType.GroupListType.class), "com.mvnforum.jaxb.db.impl.MvnforumTypeImpl.GroupListTypeImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.AttachmentType.class), "com.mvnforum.jaxb.db.impl.AttachmentTypeImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.MessageFolderType.class), "com.mvnforum.jaxb.db.impl.MessageFolderTypeImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.GroupMemberList.class), "com.mvnforum.jaxb.db.impl.GroupMemberListImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.PostList.class), "com.mvnforum.jaxb.db.impl.PostListImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.CategoryType.class), "com.mvnforum.jaxb.db.impl.CategoryTypeImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.MessageList.class), "com.mvnforum.jaxb.db.impl.MessageListImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.MemberForumPermissionType.class), "com.mvnforum.jaxb.db.impl.MemberForumPermissionTypeImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.ForumType.class), "com.mvnforum.jaxb.db.impl.ForumTypeImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.CategoryListType.class), "com.mvnforum.jaxb.db.impl.CategoryListTypeImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.ThreadWatchType.class), "com.mvnforum.jaxb.db.impl.ThreadWatchTypeImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.Mvnforum.class), "com.mvnforum.jaxb.db.impl.MvnforumImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.ForumWatchList.class), "com.mvnforum.jaxb.db.impl.ForumWatchListImpl");
        defaultImplementations.put((com.mvnforum.jaxb.db.GroupForumPermissionType.class), "com.mvnforum.jaxb.db.impl.GroupForumPermissionTypeImpl");
        rootTagMap.put(new javax.xml.namespace.QName("", "mvnforum"), (com.mvnforum.jaxb.db.Mvnforum.class));
    }

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mvnforum.jaxb.db
     * 
     */
    public ObjectFactory() {
        super(grammarInfo);
    }

    /**
     * Create an instance of the specified Java content interface.
     * 
     * @param javaContentInterface
     *     the Class object of the javacontent interface to instantiate
     * @return
     *     a new instance
     * @throws JAXBException
     *     if an error occurs
     */
    public java.lang.Object newInstance(java.lang.Class javaContentInterface)
        throws javax.xml.bind.JAXBException
    {
        return super.newInstance(javaContentInterface);
    }

    /**
     * Get the specified property. This method can only be
     * used to get provider specific properties.
     * Attempting to get an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param name
     *     the name of the property to retrieve
     * @return
     *     the value of the requested property
     * @throws PropertyException
     *     when there is an error retrieving the given property or value
     */
    public java.lang.Object getProperty(java.lang.String name)
        throws javax.xml.bind.PropertyException
    {
        return super.getProperty(name);
    }

    /**
     * Set the specified property. This method can only be
     * used to set provider specific properties.
     * Attempting to set an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param name
     *     the name of the property to retrieve
     * @param value
     *     the value of the property to be set
     * @throws PropertyException
     *     when there is an error processing the given property or value
     */
    public void setProperty(java.lang.String name, java.lang.Object value)
        throws javax.xml.bind.PropertyException
    {
        super.setProperty(name, value);
    }

    /**
     * Create an instance of CategoryWatchList
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.CategoryWatchList createCategoryWatchList()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.CategoryWatchListImpl();
    }

    /**
     * Create an instance of GlobalPermissionList
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.GlobalPermissionList createGlobalPermissionList()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.GlobalPermissionListImpl();
    }

    /**
     * Create an instance of MemberType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.MemberType createMemberType()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.MemberTypeImpl();
    }

    /**
     * Create an instance of RankType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.RankType createRankType()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.RankTypeImpl();
    }

    /**
     * Create an instance of ThreadList
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.ThreadList createThreadList()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.ThreadListImpl();
    }

    /**
     * Create an instance of GroupMemberType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.GroupMemberType createGroupMemberType()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.GroupMemberTypeImpl();
    }

    /**
     * Create an instance of ThreadWatchList
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.ThreadWatchList createThreadWatchList()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.ThreadWatchListImpl();
    }

    /**
     * Create an instance of AttachmentList
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.AttachmentList createAttachmentList()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.AttachmentListImpl();
    }

    /**
     * Create an instance of ForumList
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.ForumList createForumList()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.ForumListImpl();
    }

    /**
     * Create an instance of FavoriteThreadList
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.FavoriteThreadList createFavoriteThreadList()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.FavoriteThreadListImpl();
    }

    /**
     * Create an instance of MvnforumTypeRankListType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.MvnforumType.RankListType createMvnforumTypeRankListType()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.MvnforumTypeImpl.RankListTypeImpl();
    }

    /**
     * Create an instance of MessageFolderList
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.MessageFolderList createMessageFolderList()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.MessageFolderListImpl();
    }

    /**
     * Create an instance of MessageType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.MessageType createMessageType()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.MessageTypeImpl();
    }

    /**
     * Create an instance of MvnforumType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.MvnforumType createMvnforumType()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.MvnforumTypeImpl();
    }

    /**
     * Create an instance of GlobalWatchType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.GlobalWatchType createGlobalWatchType()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.GlobalWatchTypeImpl();
    }

    /**
     * Create an instance of PostType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.PostType createPostType()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.PostTypeImpl();
    }

    /**
     * Create an instance of MemberForumPermissionList
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.MemberForumPermissionList createMemberForumPermissionList()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.MemberForumPermissionListImpl();
    }

    /**
     * Create an instance of FavoriteThreadType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.FavoriteThreadType createFavoriteThreadType()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.FavoriteThreadTypeImpl();
    }

    /**
     * Create an instance of ThreadType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.ThreadType createThreadType()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.ThreadTypeImpl();
    }

    /**
     * Create an instance of GlobalWatchList
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.GlobalWatchList createGlobalWatchList()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.GlobalWatchListImpl();
    }

    /**
     * Create an instance of GroupType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.GroupType createGroupType()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.GroupTypeImpl();
    }

    /**
     * Create an instance of MvnforumTypeMemberListType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.MvnforumType.MemberListType createMvnforumTypeMemberListType()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.MvnforumTypeImpl.MemberListTypeImpl();
    }

    /**
     * Create an instance of GroupForumPermissionList
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.GroupForumPermissionList createGroupForumPermissionList()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.GroupForumPermissionListImpl();
    }

    /**
     * Create an instance of MvnforumTypeGroupListType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.MvnforumType.GroupListType createMvnforumTypeGroupListType()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.MvnforumTypeImpl.GroupListTypeImpl();
    }

    /**
     * Create an instance of AttachmentType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.AttachmentType createAttachmentType()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.AttachmentTypeImpl();
    }

    /**
     * Create an instance of MessageFolderType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.MessageFolderType createMessageFolderType()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.MessageFolderTypeImpl();
    }

    /**
     * Create an instance of GroupMemberList
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.GroupMemberList createGroupMemberList()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.GroupMemberListImpl();
    }

    /**
     * Create an instance of PostList
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.PostList createPostList()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.PostListImpl();
    }

    /**
     * Create an instance of CategoryType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.CategoryType createCategoryType()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.CategoryTypeImpl();
    }

    /**
     * Create an instance of MessageList
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.MessageList createMessageList()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.MessageListImpl();
    }

    /**
     * Create an instance of MemberForumPermissionType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.MemberForumPermissionType createMemberForumPermissionType()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.MemberForumPermissionTypeImpl();
    }

    /**
     * Create an instance of ForumType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.ForumType createForumType()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.ForumTypeImpl();
    }

    /**
     * Create an instance of CategoryListType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.CategoryListType createCategoryListType()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.CategoryListTypeImpl();
    }

    /**
     * Create an instance of ThreadWatchType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.ThreadWatchType createThreadWatchType()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.ThreadWatchTypeImpl();
    }

    /**
     * Create an instance of Mvnforum
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.Mvnforum createMvnforum()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.MvnforumImpl();
    }

    /**
     * Create an instance of ForumWatchList
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.ForumWatchList createForumWatchList()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.ForumWatchListImpl();
    }

    /**
     * Create an instance of GroupForumPermissionType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.mvnforum.jaxb.db.GroupForumPermissionType createGroupForumPermissionType()
        throws javax.xml.bind.JAXBException
    {
        return new com.mvnforum.jaxb.db.impl.GroupForumPermissionTypeImpl();
    }

}
