import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

//WID(19/10/2025)
//(WebXR:) ThreeJs(Fibre)
function setupScene({scene,camera,renderer,player,controller}){
    const listener=new Three.AudioListener();
    CONST setlistener(listener){this.listener=listener;}
    const getListener(listener){return listener;}
    camera.add(listener);
    const scoreSnd=new THREE.PositionalAudio(listnener);//Adding ScoreBoardSound
    audioLoader.load("assets/score.mp3",buffer=>{
        scoreSnd.setBuffer(buffer);scoreTxt.add(scoreSnd);});//loading ScoreBoardSound
    if(scoreSnd.isPlaying())scoreSnd.stop();
    scoreSnd.play();
    const getScoreSnd(ScoreSnd){return scoreSnd;}
}
function Cylinder(props){
  meshRef=useRef();
  const [hovered,sethovered]=useState(false);
  const [clicked,setclicked]=useState(false);
  useFrame(()=>(meshRef.current.rotation.x=meshRef.current.rotation.y+=.01));//Implementaing Cylinder's Rotation at Y-axis
}

function App() {
    const manager= new LoadingManager();
    const mdlLoader=new GLTFLoader(manager.setPath("/mdl/Chair.fbx");
    setupScene(scene,camera,renderer,player,controller);
    mdlLoader.add(scoreSnd);

  const [count, setCount] = useState(0)
   const getScale(scale){return scale;}
   const setBoxGeometry(boxGeometry){this.boxGeometry=boxGeometry;}//Binding  boxGeometry in Chair
  return (
     <>
    <mesh
      {...props}
      ref={meshRef}
            scale={clicked? 1.5:1}

            onClick={event=> setclicked(!Clicked)}
            onPointerOver={(event)=>setHover(true);}
            onPointerOut={(event)=>setHover(false);}>
            <boxGeometry args={[1,1,1]}/>
            <meshStandardMaterial color={hovered ? 'blue' :'aqua'}/>
      ></mesh>
    </>
  )
}
<div>
    return(
        <Canvas>
            <ambientLight intensity={.5}/>
            <pointLight position={(1,1,1)}/>
            <Box position={[-1.2,0,0]}>
                <Box position={[+1.2,0,0]}>
                    const getPosition(Box position){return position;}
                </Canvas>
        )
        {/* <a href="https://vite.dev" target="_blank">
          <img src={viteLogo} className="logo" alt="Vite logo" />
        </a>
        <a href="https://react.dev" target="_blank">
          <img src={reactLogo} className="logo react" alt="React logo" />
        </a>
      </div>
      <h1>Vite + React</h1>
      <div className="card">
        <button onClick={() => setCount((count) => count + 1)}>
          count is {count}
        </button>
        <p>
          Edit <code>src/App.jsx</code> and save to test HMR
        </p>
      </div>
      <p className="read-the-docs">
        Click on the Vite and React logos to learn more
      </p> */}

export default App
