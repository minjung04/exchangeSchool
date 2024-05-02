
let cnt = 0;
function nextbtn(){

    //사용자 정보 변수에 담기
    if(cnt == 0){
        let user_num = document.getElementsByClassName('user_num')[0].value;
        let user_name = document.getElementsByClassName('user_name')[0].value;
        console.log(user_name, user_num);

        // 정보 input 안보이게하고 다음으로
        let info = document.getElementsByClassName('info-container')[0];
        let q1 = document.getElementById('q1');
        info.style.display = 'none';
        q1.style.display = 'block';

        //이전 버튼 생성
        let prebtn = document.getElementsByClassName('prebtn')[0];
        prebtn.style.display = 'block';

        //cnt증가
        cnt += 1;
        console.log(cnt);
    }else if(cnt == 1){
        //체크값 가져옴
        langCheck();

        let q1 = document.getElementById('q1');
        let q2 = document.getElementById('q2');
        q1.style.display = 'none';
        q2.style.display = 'block';
        cnt++;

    }else if(cnt == 2){
        //체크값 가져옴
        masterCheck();

        let q2 = document.getElementById('q2');
        let q3 = document.getElementById('q3');
        q2.style.display = 'none';
        q3.style.display = 'block';
        cnt++;
    }else if(cnt == 3){
        loaCheck();

        let q3 = document.getElementById('q3');
        let q4 = document.getElementById('q4');
        q3.style.display = 'none';
        q4.style.display = 'block';
        cnt++;
    }else if(cnt == 4){
        levelCheck();

        let q4 = document.getElementById('q4');
        let q5 = document.getElementById('q5');
        q4.style.display = 'none';
        q5.style.display = 'block';
        cnt++;

    }else if(cnt == 5){
        gradeCheck();

        let q5 = document.getElementById('q5');
        let q6 = document.getElementById('q6');
        q5.style.display = 'none';
        q6.style.display = 'block';
        cnt++;
    }else if(cnt == 6){
        fallCheck();
        //제출 버튼 생성
        let resultbtn = document.getElementsByClassName('resultbtn')[0];
        resultbtn.style.display='block';

        let q6 = document.getElementById('q6');
        let q7 = document.getElementById('q7');
        q6.style.display = 'none';
        q7.style.display = 'block';
        cnt++;
    }

}

function prebtn(){
    cnt--;

    //이게 전꺼
    let content = 'q'+String(cnt);
    //이게 지금꺼
    let nextContent = 'q'+String(cnt+1);
    console.log(cnt);
    console.log('content : ' ,content);
    console.log('nextcontent : ' ,nextContent);

    let none_content = document.getElementsByClassName(eval(""+"content"+""))[0];
    console.log("none_content : ",none_content);
    none_content.style.display = 'block';

    let blockContent = document.getElementsByClassName(eval('nextContent'))[0];
    blockContent.style.display = 'none';
}

function langCheck(){
    let lang = document.getElementsByName('lang');
    for(let i = 0; i < lang.length; i++){
        if(lang[i].checked == true){
            console.log(lang[i].value);
        }
    }
}

function masterCheck(){
    let master = document.getElementsByName('master');
    for(let i = 0; i<master.length; i++){
        if(master[i].checked == true){
            console.log(master[i].value);
        }
    }
}

function loaCheck(){
    let loa = document.getElementsByName('loa');
    for(let i = 0; i<loa.length; i++){
        if(loa[i].checked == true){
            console.log(loa[i].value);
        }
    }
}

function levelCheck(){
    let level = document.getElementsByName('level');
    let gpa = document.getElementsByClassName('gpa-input')[0];
    for(let i = 0; i<level.length; i++){
        if(level[i].checked == true){
            console.log(level[i].value);
        }
    }
    console.log(gpa.value);

}

function gradeCheck(){
    let language_class = document.getElementsByName('language_class');
    let grade = document.getElementsByClassName('grade-input')[0];
    for(let i = 0; i<language_class.length; i++){
        if(language_class[i].checked == true){
            console.log(language_class[i].value);
        }
    }
    console.log(grade.value);
}

function fallCheck(){
    let fallStart = document.getElementsByClassName('fall_start')[0];
    let fallEnd = document.getElementsByClassName('fall_end')[0];
    console.log(fallStart.value);
    console.log(fallEnd.value);
}

function springCheck(){
    let springStart = document.getElementsByClassName('spring_start')[0];
    let springEnd = document.getElementsByClassName('spring_end')[0];
    console.log(springStart.value);
    console.log(springEnd.value);
}

