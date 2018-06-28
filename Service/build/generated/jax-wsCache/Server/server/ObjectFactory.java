
package server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the server package. 
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
@XmlRegistry
public class ObjectFactory {

    private final static QName _PostCommentResponse_QNAME = new QName("http://Server/", "postCommentResponse");
    private final static QName _GetPWord_QNAME = new QName("http://Server/", "getPWord");
    private final static QName _CheckDetailsResponse_QNAME = new QName("http://Server/", "checkDetailsResponse");
    private final static QName _PostTopicResponse_QNAME = new QName("http://Server/", "postTopicResponse");
    private final static QName _Connect_QNAME = new QName("http://Server/", "connect");
    private final static QName _PostTopic_QNAME = new QName("http://Server/", "postTopic");
    private final static QName _CheckDetails_QNAME = new QName("http://Server/", "checkDetails");
    private final static QName _RetrieveComments_QNAME = new QName("http://Server/", "retrieveComments");
    private final static QName _UpdateInfoResponse_QNAME = new QName("http://Server/", "updateInfoResponse");
    private final static QName _RetrieveTopics_QNAME = new QName("http://Server/", "retrieveTopics");
    private final static QName _Register_QNAME = new QName("http://Server/", "register");
    private final static QName _RetrieveReplies_QNAME = new QName("http://Server/", "retrieveReplies");
    private final static QName _RetrieveCommentsResponse_QNAME = new QName("http://Server/", "retrieveCommentsResponse");
    private final static QName _PostReplyResponse_QNAME = new QName("http://Server/", "postReplyResponse");
    private final static QName _DisconnectResponse_QNAME = new QName("http://Server/", "disconnectResponse");
    private final static QName _RetrieveTopicsResponse_QNAME = new QName("http://Server/", "retrieveTopicsResponse");
    private final static QName _PostComment_QNAME = new QName("http://Server/", "postComment");
    private final static QName _Disconnect_QNAME = new QName("http://Server/", "disconnect");
    private final static QName _RetrieveRepliesResponse_QNAME = new QName("http://Server/", "retrieveRepliesResponse");
    private final static QName _PostReply_QNAME = new QName("http://Server/", "postReply");
    private final static QName _GetPWordResponse_QNAME = new QName("http://Server/", "getPWordResponse");
    private final static QName _UpdateInfo_QNAME = new QName("http://Server/", "updateInfo");
    private final static QName _ConnectResponse_QNAME = new QName("http://Server/", "connectResponse");
    private final static QName _RegisterResponse_QNAME = new QName("http://Server/", "registerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPWord }
     * 
     */
    public GetPWord createGetPWord() {
        return new GetPWord();
    }

    /**
     * Create an instance of {@link PostCommentResponse }
     * 
     */
    public PostCommentResponse createPostCommentResponse() {
        return new PostCommentResponse();
    }

    /**
     * Create an instance of {@link PostTopicResponse }
     * 
     */
    public PostTopicResponse createPostTopicResponse() {
        return new PostTopicResponse();
    }

    /**
     * Create an instance of {@link Connect }
     * 
     */
    public Connect createConnect() {
        return new Connect();
    }

    /**
     * Create an instance of {@link CheckDetailsResponse }
     * 
     */
    public CheckDetailsResponse createCheckDetailsResponse() {
        return new CheckDetailsResponse();
    }

    /**
     * Create an instance of {@link CheckDetails }
     * 
     */
    public CheckDetails createCheckDetails() {
        return new CheckDetails();
    }

    /**
     * Create an instance of {@link PostTopic }
     * 
     */
    public PostTopic createPostTopic() {
        return new PostTopic();
    }

    /**
     * Create an instance of {@link RetrieveTopics }
     * 
     */
    public RetrieveTopics createRetrieveTopics() {
        return new RetrieveTopics();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link UpdateInfoResponse }
     * 
     */
    public UpdateInfoResponse createUpdateInfoResponse() {
        return new UpdateInfoResponse();
    }

    /**
     * Create an instance of {@link RetrieveComments }
     * 
     */
    public RetrieveComments createRetrieveComments() {
        return new RetrieveComments();
    }

    /**
     * Create an instance of {@link RetrieveTopicsResponse }
     * 
     */
    public RetrieveTopicsResponse createRetrieveTopicsResponse() {
        return new RetrieveTopicsResponse();
    }

    /**
     * Create an instance of {@link DisconnectResponse }
     * 
     */
    public DisconnectResponse createDisconnectResponse() {
        return new DisconnectResponse();
    }

    /**
     * Create an instance of {@link PostReplyResponse }
     * 
     */
    public PostReplyResponse createPostReplyResponse() {
        return new PostReplyResponse();
    }

    /**
     * Create an instance of {@link RetrieveCommentsResponse }
     * 
     */
    public RetrieveCommentsResponse createRetrieveCommentsResponse() {
        return new RetrieveCommentsResponse();
    }

    /**
     * Create an instance of {@link RetrieveReplies }
     * 
     */
    public RetrieveReplies createRetrieveReplies() {
        return new RetrieveReplies();
    }

    /**
     * Create an instance of {@link GetPWordResponse }
     * 
     */
    public GetPWordResponse createGetPWordResponse() {
        return new GetPWordResponse();
    }

    /**
     * Create an instance of {@link PostReply }
     * 
     */
    public PostReply createPostReply() {
        return new PostReply();
    }

    /**
     * Create an instance of {@link RetrieveRepliesResponse }
     * 
     */
    public RetrieveRepliesResponse createRetrieveRepliesResponse() {
        return new RetrieveRepliesResponse();
    }

    /**
     * Create an instance of {@link Disconnect }
     * 
     */
    public Disconnect createDisconnect() {
        return new Disconnect();
    }

    /**
     * Create an instance of {@link PostComment }
     * 
     */
    public PostComment createPostComment() {
        return new PostComment();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link ConnectResponse }
     * 
     */
    public ConnectResponse createConnectResponse() {
        return new ConnectResponse();
    }

    /**
     * Create an instance of {@link UpdateInfo }
     * 
     */
    public UpdateInfo createUpdateInfo() {
        return new UpdateInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostCommentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "postCommentResponse")
    public JAXBElement<PostCommentResponse> createPostCommentResponse(PostCommentResponse value) {
        return new JAXBElement<PostCommentResponse>(_PostCommentResponse_QNAME, PostCommentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPWord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "getPWord")
    public JAXBElement<GetPWord> createGetPWord(GetPWord value) {
        return new JAXBElement<GetPWord>(_GetPWord_QNAME, GetPWord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "checkDetailsResponse")
    public JAXBElement<CheckDetailsResponse> createCheckDetailsResponse(CheckDetailsResponse value) {
        return new JAXBElement<CheckDetailsResponse>(_CheckDetailsResponse_QNAME, CheckDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostTopicResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "postTopicResponse")
    public JAXBElement<PostTopicResponse> createPostTopicResponse(PostTopicResponse value) {
        return new JAXBElement<PostTopicResponse>(_PostTopicResponse_QNAME, PostTopicResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Connect }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "connect")
    public JAXBElement<Connect> createConnect(Connect value) {
        return new JAXBElement<Connect>(_Connect_QNAME, Connect.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostTopic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "postTopic")
    public JAXBElement<PostTopic> createPostTopic(PostTopic value) {
        return new JAXBElement<PostTopic>(_PostTopic_QNAME, PostTopic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "checkDetails")
    public JAXBElement<CheckDetails> createCheckDetails(CheckDetails value) {
        return new JAXBElement<CheckDetails>(_CheckDetails_QNAME, CheckDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveComments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "retrieveComments")
    public JAXBElement<RetrieveComments> createRetrieveComments(RetrieveComments value) {
        return new JAXBElement<RetrieveComments>(_RetrieveComments_QNAME, RetrieveComments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "updateInfoResponse")
    public JAXBElement<UpdateInfoResponse> createUpdateInfoResponse(UpdateInfoResponse value) {
        return new JAXBElement<UpdateInfoResponse>(_UpdateInfoResponse_QNAME, UpdateInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveTopics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "retrieveTopics")
    public JAXBElement<RetrieveTopics> createRetrieveTopics(RetrieveTopics value) {
        return new JAXBElement<RetrieveTopics>(_RetrieveTopics_QNAME, RetrieveTopics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveReplies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "retrieveReplies")
    public JAXBElement<RetrieveReplies> createRetrieveReplies(RetrieveReplies value) {
        return new JAXBElement<RetrieveReplies>(_RetrieveReplies_QNAME, RetrieveReplies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveCommentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "retrieveCommentsResponse")
    public JAXBElement<RetrieveCommentsResponse> createRetrieveCommentsResponse(RetrieveCommentsResponse value) {
        return new JAXBElement<RetrieveCommentsResponse>(_RetrieveCommentsResponse_QNAME, RetrieveCommentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostReplyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "postReplyResponse")
    public JAXBElement<PostReplyResponse> createPostReplyResponse(PostReplyResponse value) {
        return new JAXBElement<PostReplyResponse>(_PostReplyResponse_QNAME, PostReplyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisconnectResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "disconnectResponse")
    public JAXBElement<DisconnectResponse> createDisconnectResponse(DisconnectResponse value) {
        return new JAXBElement<DisconnectResponse>(_DisconnectResponse_QNAME, DisconnectResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveTopicsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "retrieveTopicsResponse")
    public JAXBElement<RetrieveTopicsResponse> createRetrieveTopicsResponse(RetrieveTopicsResponse value) {
        return new JAXBElement<RetrieveTopicsResponse>(_RetrieveTopicsResponse_QNAME, RetrieveTopicsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostComment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "postComment")
    public JAXBElement<PostComment> createPostComment(PostComment value) {
        return new JAXBElement<PostComment>(_PostComment_QNAME, PostComment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Disconnect }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "disconnect")
    public JAXBElement<Disconnect> createDisconnect(Disconnect value) {
        return new JAXBElement<Disconnect>(_Disconnect_QNAME, Disconnect.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveRepliesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "retrieveRepliesResponse")
    public JAXBElement<RetrieveRepliesResponse> createRetrieveRepliesResponse(RetrieveRepliesResponse value) {
        return new JAXBElement<RetrieveRepliesResponse>(_RetrieveRepliesResponse_QNAME, RetrieveRepliesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostReply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "postReply")
    public JAXBElement<PostReply> createPostReply(PostReply value) {
        return new JAXBElement<PostReply>(_PostReply_QNAME, PostReply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPWordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "getPWordResponse")
    public JAXBElement<GetPWordResponse> createGetPWordResponse(GetPWordResponse value) {
        return new JAXBElement<GetPWordResponse>(_GetPWordResponse_QNAME, GetPWordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "updateInfo")
    public JAXBElement<UpdateInfo> createUpdateInfo(UpdateInfo value) {
        return new JAXBElement<UpdateInfo>(_UpdateInfo_QNAME, UpdateInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "connectResponse")
    public JAXBElement<ConnectResponse> createConnectResponse(ConnectResponse value) {
        return new JAXBElement<ConnectResponse>(_ConnectResponse_QNAME, ConnectResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

}
