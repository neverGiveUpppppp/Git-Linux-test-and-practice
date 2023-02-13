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