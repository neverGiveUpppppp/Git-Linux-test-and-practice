
배치프로그램
대용량데이터, 자동화, 견고성, 안정성/신뢰성, 성능

[OSI 7 layer vs TCP/IP]

1-3 : 하위계층
4-7 : 상위계층


[TCP/IP 4 Layer]

Application : FTP,DNS, HTTP, telnet, SMTP
Transport : TCP, UDP
Internet : ICMP, ARP, RARP, IP
Network Interface(Nework access)

Transport layer
 - 데이터 전송서비스 제공 
 - 종단시스템(End-to-End) 간 전송 연결설정, 데이터 전송, 연결 해제 기능
 - 주소 설정, 분할 및 재조립, 오류 제어, 흐름 제어 수행


Netowrk Layer
 - 개방 시스템들 간의 네트워크 연결 관리, 데이터 교환 및 중계 기능
 - 네트워크 연결의 설정, 유지, 해제 기능
 - 경로설정(Routing), 데이터 ㄱ환 및 중계, 트래픽 제어, 패킷 정보 전송 수행


 ==========

Session Layer
 - 송수신 측 간의 관련성 유지, 대화 제어
 - 대화 구성 및 동기 제어, 데이터 교환 관리 기능


conflict happend



merge --squash test go
222
333
444



/** 기관명 명 */
public static final String ORG_NAME = Config.getString("webapp-config.orgName");
/** 시스템 명 */
public static final String SYSTEM_NAME = Config.getString("system-config.systemName");
/** 시스템구분 */
public static final String SYSTEM_KIND = Config.getString("system-config.system-kind", "intra");
/** 기본인코딩 */
public static final String CHAR_SET = Config.getString("system-config.defaultCharset");
/** 운영 모드 true 또는 false */
public static final Boolean PRO_MODE = Config.getBoolean("webapp-config.productionMode");
/** 개발환경 소스파일 Root 경로 PRO_MODE 에 따라서 개발환경시 일부에서 사용되는 값 */
public static List<String> DEV_PATH_LIST = Config.getList(String.class, "locations-config.devPaths.value");
/** 게시판 템플릿, cms 등 화면을 통하여 파일을 생성하는 경우 동시에 만들어져야 하는 경로 */
public static List<String> PROGRAM_PATH_LIST = Config.getList(String.class, "locations-config.programPaths.value");
/** 첨부제한 업로드 파일 */
public static final String[] NOT_ALLOW_FILE_EXTS;
static {
		NOT_ALLOW_FILE_EXTS = StringUtil.deleteWhitespace(
		Config.getString("system-config.notAllowFileExts", "jsp,java,exe,asp,php,bat,sh")).split(",");
		}
/** 이미지 업로드 파일 */
public static final String[] IMAGE_FILE_EXTS;
static {
		IMAGE_FILE_EXTS = StringUtil.deleteWhitespace(
		Config.getString("system-config.imageFileExts", "bmp,gif,jpe,jpg,jpeg,jfif,pcx,png,tiff,wbmp")).split(",");
		}


/* ----------------------- LOCATION INFO --------------------- */
/** 서버 루트 경로 */
public static final String WEBAPP_ROOT;
/** 첨부파일 저장위치 */
public static final String UPLOAD_ROOT;
/** 정적컨텐츠 저장위치 */
public static final String RESOURCE_ROOT;
/*
 * 별도의 설정이 있는 경우 사용하며, 없는 경우는 서버 기본값으로 설정
 * 설정파일 : /src/main/resources/config/commons/location-commons-config.xml
 */
static {
        String tmp;
        String webappRoot = Config.getString("locations-config.webappRoot");
        if(Validate.isEmpty(webappRoot)) {
        String webAppRootKey = Config.getString("locations-config.webAppRootKey");
        String systemRootKey = "openworks4.intra.root";
        if(SYSTEM_KIND.equals("user")) {
        systemRootKey = "openworks4.user.root";
        }
        tmp = Config.getString(webAppRootKey, systemRootKey);
        tmp = StringUtil.replace(tmp, File.separator, "/");
        WEBAPP_ROOT = tmp;
        } else {
        tmp = webappRoot;
        tmp = StringUtil.replace(tmp, File.separator, "/");
        WEBAPP_ROOT = tmp;
        }

        String uploadRoot = Config.getString("locations-config.uploadRoot");
        if(Validate.isEmpty(uploadRoot)) {
        UPLOAD_ROOT = WEBAPP_ROOT;
        } else {
        tmp = uploadRoot;
        tmp = StringUtil.replace(tmp, File.separator, "/");
        UPLOAD_ROOT = tmp;
        }

        String resourceRoot = Config.getString("locations-config.resourceRoot");
        if(Validate.isEmpty(resourceRoot)) {
        RESOURCE_ROOT = WEBAPP_ROOT;
        } else {
        tmp = resourceRoot;
        tmp = StringUtil.replace(tmp, File.separator, "/");
        RESOURCE_ROOT = tmp;
        }
