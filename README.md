# git-test-practice
git test &amp; practice repository <br><br><br>



## [Git study external memory storage]   
https://positive1.notion.site/VSC-Git-403b37665db34a29a9a9d9ab97f33d92 <br><br><br>



## git 명령어   
git diff   
git diff HEAD   
git diff --staged   
git diff [branchname1]..[branchname2]   

git log   
git log -- pretty=oneline   
git log -p   
git log --patch   
git log --patch -2   
git log --graph --decorate --oneline   
git log [branchname1]..[branchname2]    
git log -p [branchname1]..[branchname2]    
git log --grep [검색어]  
 
git add -p : 변경된 파일들의 코드를 하나씩 보여주고, 스테이지(index)에 올릴지 말지 선택하게하는 옵션   


git revert [commit hash] : 해당 해쉬의 커밋 되돌리기   
git revert HEAD : 바로 직전에 작업한 내용 되돌리기   
git revert --no-commit : revert한 결과를 stage 상태만 유지하고, no commit    
git revert [commit hash1]..[commit hash2] : 여러 커밋 되돌리기   
git revert -m [순서번호] [commit hash] : 머지커밋 되돌리기   
git revert --continue : 충돌 해결 및 런   
git revert --skip : 되돌리지만 이 패치 스킵  
git revert --abort : 되돌리기 취소    


git rm [파일명] : 로컬,리모트 파일 삭제         // remote o, local o   
git rm --cached [파일명] : 리모트만 파일 삭제   // remote o, local x   
git rm -n : 삭제될 파일 프리뷰(메세지는 뜨나 실제 삭제는 x)   
git rm --cached -r [디렉토리명] : 디렉토리 전체 삭제   


git reset HEAD : 이전 add 전체 unstage
git show HEAD^ : HEAD 바로 전 커밋으로 reset
git reset HEAD 파일명 : 해당 파일을 unstage로

cf. HEAD와 HEAD^ 위치 파악하는 방법   
git log --pretty=oneline -5   
git show HEAD    
git show HEAD^    


$ git clean -f       : 디렉터리를 제외한 파일들만 삭제
$ git clean -f -n    : 어떤 파일이 지워질 지 알려줌
$ git clean -f -d    : 디렉터리까지 삭제
$ git clean -f -d -x : ignore로 무시된 파일까지 삭제



<br><br><br>
